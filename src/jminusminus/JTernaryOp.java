package jminusminus;

import java.util.Hashtable;

import static jminusminus.CLConstants.*;

class JTernaryOp extends JExpression {
        
        private JExpression condition;

        private JExpression option1;

        private JExpression option2;
   

    public JTernaryOp(int line, JExpression condition, JExpression option1, JExpression option2) {
        super(line);
        this.condition = condition;
        this.option1 = option1;
        this.option2 = option2;
    }

    public JTernaryOp analyze(Context context) {
        condition = (JExpression) condition.analyze(context);

        if (condition.type() != Type.BOOLEAN) {
            JAST.compilationUnit.reportSemanticError(line, "Ternary condition must be boolean");
        }

        option1 = (JExpression) option1.analyze(context);
        option2 = (JExpression) option2.analyze(context);

        Type t1 = option1.type();
        Type t2 = option2.type();

        if (!t1.isJavaAssignableFrom(t2) && !t2.isJavaAssignableFrom(t1)) {
            JAST.compilationUnit.reportSemanticError(line, "Incompatible types in ternary operator: %s and %s", t1, t2);
        }

        if (t2.isJavaAssignableFrom(t1)) {
            this.type = t2;
        } else {
            this.type = t1;
        }

        return this;
    }

    public void codegen(CLEmitter output) {
        String elseLabel = output.createLabel();
        String endLabel = output.createLabel();

        condition.codegen(output, elseLabel, false);

        option1.codegen(output);
        output.addBranchInstruction(GOTO, endLabel);

        output.addLabel(elseLabel);
        option2.codegen(output);

        output.addLabel(endLabel);
    }

    public void toJSON(JSONElement json) {
        JSONElement e = new JSONElement();
        json.addChild("JTernaryOp:" + line, e);

        // ??? FIX
        // e.addAttribute("operator", TERQ);

        JSONElement e1 = new JSONElement();
        e.addChild("Condition", e1);
        JSONElement e2 = new JSONElement();
        e2.addChild("Option1", e2);

        // ??? FIX
        // e.addAttribute("operator", TERC);

        JSONElement e3 = new JSONElement();
        e3.addChild("Option2", e3);
    }
}
