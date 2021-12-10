
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateja
 */
import java.util.Stack;
import java.util.ArrayList;

public class SyntaxTableRuleObject extends SyntaxTableObject
{
public int ruleNumber;
    public ArrayList<Integer> rightSide;

    public SyntaxTableRuleObject(int ruleNumber, int rightSide[])
    {
        super("rule");
        
        this.ruleNumber = ruleNumber;
        this.rightSide = new ArrayList<>();

        for (int i = 0; i < rightSide.length; i++)
        {
            this.rightSide.add(new Integer(rightSide[i]));
        }
    }

    public void pushToStack(Stack<Integer> stack)
    {
        if (this.rightSide.get(0).intValue() != -1)
        {
            for (int i = this.rightSide.size() - 1; i >= 0; i--)
            {
                stack.push(this.rightSide.get(i));
            }
        }
    }
}
