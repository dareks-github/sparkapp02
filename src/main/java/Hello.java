import static spark.Spark.*;

class Hello {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World");
    }


}
