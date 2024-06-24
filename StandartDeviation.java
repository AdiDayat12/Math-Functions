import java.util.Arrays;

public class StandartDeviation {
     double standartDeviation (double [] datas){
        double mean = Arrays.stream(datas).reduce(0, Double::sum) / datas.length;
        double varians = Arrays.stream(datas)
                .map(v -> v - mean)
                .map(v -> v * v)
                .reduce(0, Double::sum) / datas.length;

        return Math.sqrt(varians);
    }
}
