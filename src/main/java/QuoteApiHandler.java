import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;
import logic.Quote;

public static void getOne(Context context) {
    Integer id = context.pathParamAsClass("id", Integer.class).get();
    Quote quote = database.get(id);
    if (quote == null) {
        throw new NotFoundResponse("Quote not found: " + id);
    }
    context.json(quote);
}

void main() {
}