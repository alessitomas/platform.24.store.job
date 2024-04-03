package insper.store.job;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record JobIn (
    String empresa,
    String cargo,
    String descricao,
    Float salario
) {
    
}
