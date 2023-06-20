package repro.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface ValueObject2 {
    String field();
}
