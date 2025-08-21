package mentorship.roadmap.Java_Core.step5_AdvancedBase.topic3_Enums.task5_Operation;

public enum Operation {
    PLUS {
        @Override
        double apply(double x, double y) {
            return x+y;
        }
    }, MINUS {
        @Override
        double apply(double x, double y) {
            return x-y;
        }
    }, TIMES{
        @Override
        double apply(double x, double y) {
           return x*y;
        }
    }, DIVIDE {
        @Override
            double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException("на ноль делить нельзя");
            } else return x/y;
        }
    };
    abstract double apply(double x, double y) ;
}
