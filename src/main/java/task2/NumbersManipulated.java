package task2;

public class NumbersManipulated {
    int sum(int n1,int n2){
        return n1+n2;
    }

    int diff(int n1,int n2){
        return Math.abs(n1-n2);
    }

    int product(int n1, int n2){
        return n1 * n2;
    }

    double average(int n1, int n2){
        return sum(n1, n2)/2;
    }

    int distance(int n1,int n2){
        return diff(n1, n2);
    }

    int min(int n1 , int n2){
        return n1>n2 ? n2 : n1;
    }

    int max(int n1 , int n2){
        return n1<n2 ? n2 : n1;
    }
}
