class Lab085_classifies_a_triangle_if_condition {
    public static void main(String[] args) {
        int n1 = 10, n2 = 10, n3 = 20;

        if (n1 == n2 || n2 == n3 || n3 == n1)
        {
            if (n1 == n2 && n2 == n3) {
                System.out.println("Equilateral");
            } else {
                System.out.println("Isosceles");
            }
        } else {
            System.out.println("Scalene");
        }
    }
}
