import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {
    String value() default "Tabela Sem Nome";
}