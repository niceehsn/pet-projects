public class HangmanDrawing {

    public static void draw(int health_1) {
        switch (health_1) {


            case 4 -> System.out.println("""
                    ___________                
                    |   \\    |
                    |   ()
                    |   
                    |  
                    |
                    ~~~~~~~~~~~
                    """);
            case 3 -> System.out.println("""
                    ___________                
                    |   \\    |
                    |   ()
                    |  /[]
                    |  
                    |
                    ~~~~~~~~~~~
                    """);
            case 2 -> System.out.println("""
                    ___________                
                    |   \\    |
                    |   ()
                    |  /[]\\
                    |  
                    |
                    ~~~~~~~~~~~
                    """);
            case 1 -> System.out.println("""
                    ___________                
                    |   \\    |
                    |   ()
                    |  /[]\\
                    |  /   
                    |
                    ~~~~~~~~~~~
                    """);
            case 0 -> System.out.println("""
                    ___________                
                    |   \\    |
                    |   ()
                    |  /[]\\
                    |  /  \\
                    |
                    ~~~~~~~~~~~
                    """);
        }
    }
}