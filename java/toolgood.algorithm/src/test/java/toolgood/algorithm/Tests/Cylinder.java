package toolgood.algorithm.Tests;

import java.util.List;

import toolgood.algorithm.AlgorithmEngine;
import toolgood.algorithm.Operand;

public class Cylinder extends AlgorithmEngine {
    private int _radius;
    private int _height;

    public Cylinder(int radius, int height) {
        _radius = radius;
        _height = height;
    }

    @Override
    protected Operand GetParameter(String parameter) throws Exception {
        if (parameter.equals("半径")) {
            return Operand.Create(_radius);
        }
        if (parameter.equals("直径"))
        {
            return Operand.Create(_radius * 2);
        }
        if (parameter.equals("高"))
        {
            return Operand.Create(_height);
        }
        return super.GetParameter(parameter);
    }

    @Override
    protected Operand ExecuteDiyFunction(String funcName, List<Operand> operands)
    {
        if (funcName.equals("求面积"))
        {
            if (operands.size() == 1)
            {
                int r =(int) operands.get(0).ToNumber(null).NumberValue();
                return Operand.Create(r * r * Math.PI);
            }
        }
        return super.ExecuteDiyFunction(funcName, operands);
    }
}