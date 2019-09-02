package org.polkadot.types.codec;

import org.polkadot.types.Codec;

/**
 * @name VecAny
 * @description This manages codec arrays, assuming that the inputs are already of type Codec. Unlike
 * a vector, this can be used to manage array-like structures with variable arguments of
 * any types
 */
public class VecAny<T extends Codec> extends AbstractArray<T> {

    /**
     * @description Returns the base runtime type name for this instance
     */
    @Override
    public String toRawType() {
        // FIXME This is basically an any type, cannot instantiate via createType
        return "Vec<Codec>";
    }
}


