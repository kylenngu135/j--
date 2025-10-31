package jminusminus;

import java.util.ArrayList;

import static jminusminus.CLConstants.*;

public class JEnhancedForStatement extends JStatement {
    private JStatement variable; 
    private JExpression expr;
    private JStatement body;

    public JEnhancedForStatement(int line, JStatement variable, JExpression expr, JStatement body) {
        super(line);
        this.variable = variable;
        this.expr = expr;
        this.body = body;
    }

    public JEnhancedForStatement analyze(Context context) {
        // TODO
        return this;
    }

    public void codegen(CLEmitter output) {
        // TODO
    }

    public void toJSON(JSONElement json) {
        JSONElement e = new JSONElement();
        json.addChild("JEnhancedForStatement:" + line, e);
        JSONElement e1 = new JSONElement();
        e.addChild("Init", e1);
        variable.toJSON(e1);
        
        JSONElement e2 = new JSONElement();
        e.addChild("collection", e2);
        expr.toJSON(e2);

        if (body != null) {
            JSONElement e3 = new JSONElement();
            e.addChild("Body", e3);
            body.toJSON(e3);
        }
    }
}

