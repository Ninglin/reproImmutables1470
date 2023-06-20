package repro.immutables;

import org.immutables.value.Value;

@Value.Immutable
public interface ValueObject1 {
    ValueObject2Immutable valueObject2();
}
