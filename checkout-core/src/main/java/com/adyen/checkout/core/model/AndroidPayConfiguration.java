package com.adyen.checkout.core.model;

import android.support.annotation.NonNull;

import com.adyen.checkout.core.internal.ProvidedBy;
import com.adyen.checkout.core.internal.model.AndroidPayConfigurationImpl;

/**
 * Copyright (c) 2018 Adyen B.V.
 * <p>
 * This file is open source and available under the MIT license. See the LICENSE file for more info.
 * <p>
 * Created by timon on 04/07/2018.
 */
@ProvidedBy(AndroidPayConfigurationImpl.class)
public interface AndroidPayConfiguration extends Configuration {
    /**
     * @return The current environment for the {@code WalletOptions}.
     */
    int getEnvironment();

    /**
     * @return The merchant name for the {@code MaskedWalletRequest}.
     */
    @NonNull
    String getMerchantName();

    /**
     * @return The public key for the {@code PaymentMethodTokenizationParameters}.
     */
    @NonNull
    String getPublicKey();
}
