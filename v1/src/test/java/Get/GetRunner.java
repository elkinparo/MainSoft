package Get;

import com.intuit.karate.junit5.Karate;

public class GetRunner {
    @Karate.Test
    Karate getArticlesCreated() {
        return Karate.run("classpath:Get/get.feature");
    }
}
