package de.nordgedanken.auto_hot_key.psi;

import com.intellij.psi.tree.IElementType;
import de.nordgedanken.auto_hot_key.AHKLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class AHKElementType  extends IElementType {
    public AHKElementType( @NotNull @NonNls String debugName) {
        super(debugName, AHKLanguage.INSTANCE);
    }
}
