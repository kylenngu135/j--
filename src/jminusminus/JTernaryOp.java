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
        // TODO
        return null;
    }

    public void codegen(CLEmitter output) {
        // TODO
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
