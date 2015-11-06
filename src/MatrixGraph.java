/**
 * Created by admin on 5.11.15.
 */
public class MatrixGraph implements Graph {

    private int[][] matrix;
    private final int COUNT_VERTEX;

    public MatrixGraph(int countVertex) {
        this.COUNT_VERTEX = countVertex;
        matrix = new int[countVertex][countVertex];
        clearMatrix();
    }

    private void clearMatrix() {
        for (int x = 0; x < COUNT_VERTEX; x++) {
            for (int y = 0; y < COUNT_VERTEX; y++) {
                matrix[x][y] = 0;
            }
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        matrix[vertex1][vertex2] = 1;
    }

    public int calculateMinDegreeVertex() {
        int min = Integer.MAX_VALUE;
        for (int indexVertex = 0; indexVertex < COUNT_VERTEX; indexVertex++) {
            int count = 0;
            for(int k=0;k<COUNT_VERTEX;k++){
                count+=matrix[indexVertex][k];
            }
            if(count<min){
                min=count;
            }

        }
        return min;
    }

    public int calculateMaxDegreeVertex() {
        int max = Integer.MIN_VALUE;
        for (int indexVertex = 0; indexVertex < COUNT_VERTEX; indexVertex++) {
            int count = 0;
            for(int k=0;k<COUNT_VERTEX;k++){
                count+=matrix[indexVertex][k];
            }
            if(count>max){
                max=count;
            }

        }
        return max;
    }

    public float calculateAverageDegreeVertex() {
        int totalSum = 0;
        for (int indexVertex = 0; indexVertex < COUNT_VERTEX; indexVertex++) {
            int count = 0;
            for(int k=0;k<COUNT_VERTEX;k++){
                totalSum+=matrix[indexVertex][k];
            }
        }
        return totalSum/(float)COUNT_VERTEX;
    }

    public void showFrequencyDegree(){
        int minDegree = calculateMinDegreeVertex();
        int maxDegree = calculateMaxDegreeVertex();

        for(int degree = minDegree;degree<=maxDegree;degree++){
            int countForDegree = 0;

            for (int indexVertex = 0; indexVertex < COUNT_VERTEX; indexVertex++) {
                int count = 0;
                for (int k = 0; k < COUNT_VERTEX; k++) {
                    count += matrix[indexVertex][k];
                }
                if(count==degree){
                    countForDegree++;
                }
            }

            System.out.println(degree + ":" + countForDegree);
        }
    }


}
