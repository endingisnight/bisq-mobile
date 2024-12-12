package network.bisq.mobile.i18n

import cafe.adriel.lyricist.LyricistStrings

// @LyricistStrings(languageTag = Locales.EN, default = true)
val EnBisqEasyTradeWizardStrings = BisqEasyTradeWizardStrings(
    bisqEasy_tradeWizard_progress_directionAndMarket = "Offer type",
    bisqEasy_tradeWizard_progress_price = "Price",
    bisqEasy_tradeWizard_progress_amount = "Amount",
    bisqEasy_tradeWizard_progress_paymentMethods = "Payment methods",
    bisqEasy_tradeWizard_progress_takeOffer = "Select offer",
    bisqEasy_tradeWizard_progress_review = "Review",
    bisqEasy_tradeWizard_directionAndMarket_headline = "Do you want to buy or sell Bitcoin with",
    bisqEasy_tradeWizard_directionAndMarket_buy = "Buy Bitcoin",
    bisqEasy_tradeWizard_directionAndMarket_sell = "Sell Bitcoin",
    bisqEasy_tradeWizard_directionAndMarket_feedback_headline = "How to build up reputation?",
    bisqEasy_tradeWizard_directionAndMarket_feedback_subTitle1 = "You haven't established any reputation yet.  For Bitcoin sellers, building reputation is crucial because buyers are required to send fiat currency first  in the trade process, relying on the seller's integrity.\n\n This reputation-building process is better suited for experienced Bisq users, and you can find detailed information  about it in the 'Reputation' section.",
    bisqEasy_tradeWizard_directionAndMarket_feedback_gainReputation = "Learn how to build up reputation",
    bisqEasy_tradeWizard_directionAndMarket_feedback_subTitle2 = "While it''s possible for sellers to trade without (or insufficient) reputation for relatively low amounts up to {0},  the likelihood of finding a trading partner is considerably reduced. This is because buyers tend to avoid  engaging with sellers who lack reputation due to security risks.",
    bisqEasy_tradeWizard_directionAndMarket_feedback_tradeWithoutReputation = "Continue without reputation",
    bisqEasy_tradeWizard_directionAndMarket_feedback_backToBuy = "Back",
    bisqEasy_tradeWizard_market_headline_buyer = "In which currency do you want to pay?",
    bisqEasy_tradeWizard_market_headline_seller = "In which currency do you want to get paid?",
    bisqEasy_tradeWizard_market_subTitle = "Choose your trade currency",
    bisqEasy_tradeWizard_market_columns_name = "Fiat currency",
    bisqEasy_tradeWizard_market_columns_numOffers = "Num. offers",
    bisqEasy_tradeWizard_market_columns_numPeers = "Online peers",
    bisqEasy_price_headline = "What is your trade price?",
    bisqEasy_tradeWizard_price_subtitle = "This can be defined as a percentage price which floats with the market price or fixed price.",
    bisqEasy_price_percentage_title = "Percentage price",
    bisqEasy_price_percentage_inputBoxText = "Market price percentage between -10% and 50%",
    bisqEasy_price_tradePrice_title = "Fixed price",
    bisqEasy_price_tradePrice_inputBoxText = { currency -> "Trade price in $currency" },
    bisqEasy_price_feedback_sentence = "Your offer has {0} chances to be taken at this price.",
    bisqEasy_price_feedback_sentence_veryLow = "very low",
    bisqEasy_price_feedback_sentence_low = "low",
    bisqEasy_price_feedback_sentence_some = "some",
    bisqEasy_price_feedback_sentence_good = "good",
    bisqEasy_price_feedback_sentence_veryGood = "very good",
    bisqEasy_price_feedback_learnWhySection_openButton = "Why?",
    bisqEasy_price_feedback_learnWhySection_closeButton = "Back to Trade Price",
    bisqEasy_price_feedback_learnWhySection_title = "Why should I pay a higher price to the seller?",
    bisqEasy_price_feedback_learnWhySection_description_intro = "The reason for that is that the seller has to cover extra expenses  and compensate for the seller's service, specifically:",
    bisqEasy_price_feedback_learnWhySection_description_exposition = " - Build up reputation which can be costly - The seller has to pay for miner fees - The seller is the helpful guide in the trade process thus investing more time",
    bisqEasy_price_warn_invalidPrice_outOfRange = "The price you entered is outside the permitted range of -10% to 50%.",
    bisqEasy_price_warn_invalidPrice_numberFormatException = "The price you entered is not a valid number.",
    bisqEasy_price_warn_invalidPrice_exception = "The price you entered is invalid.\n\n Error message: {0}",
    bisqEasy_tradeWizard_amount_headline_buyer = "How much do you want to spend?",
    bisqEasy_tradeWizard_amount_headline_seller = "How much do you want to receive?",
    bisqEasy_tradeWizard_amount_description_minAmount = "Set the minimum value for the amount range",
    bisqEasy_tradeWizard_amount_description_maxAmount = "Set the maximum value for the amount range",
    bisqEasy_tradeWizard_amount_description_fixAmount = "Set the amount you want to trade",
    bisqEasy_tradeWizard_amount_addMinAmountOption = "Add min/max range for amount",
    bisqEasy_tradeWizard_amount_removeMinAmountOption = "Use fix value amount",
    bisqEasy_component_amount_minRangeValue = "Min {0}",
    bisqEasy_component_amount_maxRangeValue = "Max {0}",
    bisqEasy_component_amount_baseSide_tooltip_btcAmount_marketPrice = "This is the Bitcoin amount with current market price.",
    bisqEasy_component_amount_baseSide_tooltip_btcAmount_selectedPrice = "This is the Bitcoin amount with your selected price.",
    bisqEasy_component_amount_baseSide_tooltip_buyerInfo = "Sellers may ask for a higher price as they have costs for acquiring reputation.\n 5-15% price premium is common.",
    bisqEasy_component_amount_baseSide_tooltip_bestOfferPrice = "This is the Bitcoin amount with the best price\n from matching offers: {0}",
    bisqEasy_component_amount_baseSide_tooltip_buyer_btcAmount = "This is the Bitcoin amount to receive",
    bisqEasy_component_amount_baseSide_tooltip_seller_btcAmount = "This is the Bitcoin amount to spend",
    bisqEasy_component_amount_baseSide_tooltip_taker_offerPrice = "with the offer price: {0}",
    bisqEasy_tradeWizard_amount_limitInfo_overlay_headline = "Reputation-based trade amount limits",
    bisqEasy_tradeWizard_amount_limitInfo_overlay_close = "Close overlay",
    bisqEasy_tradeWizard_amount_seller_wizard_numMatchingOffers_info = "There {0} matching the chosen trade amount.",
    bisqEasy_tradeWizard_amount_seller_wizard_limitInfo = "With your reputation score of {0}, you can trade up to",
    bisqEasy_tradeWizard_amount_seller_wizard_limitInfo_overlay_info = "With a reputation score of {0}, you can trade up to {1}.\n\n You can find information on how to increase your reputation at ''Reputation/Build Reputation''.",
    bisqEasy_tradeWizard_amount_seller_limitInfo_scoreTooLow = "With your reputation score of {0}, your trade amount should not exceed",
    bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_info_scoreTooLow = "Your reputation score of {0} doesn''t offer sufficient security for buyers.\n\n Buyers who consider to take your offer will receive a warning about potential risks when taking your offer.\n\n You can find information on how to increase your reputation at ''Reputation/Build Reputation''.",
    bisqEasy_takeOffer_amount_seller_limitInfo_lowToleratedAmount = "As the trade amount is below {0}, reputation requirements are relaxed.",
    bisqEasy_takeOffer_amount_seller_limitInfo_scoreTooLow = "As your reputation score is only {0} your trade amount is restricted to",
    bisqEasy_takeOffer_amount_seller_limitInfo_overlay_info_scoreTooLow = "For amounts up to {0} the reputation requirements are relaxed.\n\n Your reputation score of {1} doesn''t offer sufficient security for the buyer. However, given the low trade amount the buyer accepted to take the risk.\n\n You can find information on how to increase your reputation at ''Reputation/Build Reputation''.",
    bisqEasy_tradeWizard_amount_seller_limitInfo_sufficientScore = "Your reputation score of {0} provides security for offers up to",
    bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_info_sufficientScore = "With a reputation score of {0}, you provide security for trades up to {1}.",
    bisqEasy_tradeWizard_amount_seller_limitInfo_inSufficientScore = "The security provided by your reputation score of {0} is insufficient for offers over",
    bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_info_inSufficientScore = "With a reputation score of {0}, the security you provide is insufficient for trades over {1}.\n\n You can still create such offers, but buyers will be warned about potential risks when attempting to take your offer.\n\n You can find information on how to increase your reputation at ''Reputation/Build Reputation''.",
    bisqEasy_tradeWizard_amount_seller_limitInfoAmount = "{0}.",
    bisqEasy_tradeWizard_amount_seller_limitInfo_link = "Learn more",
    bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_linkToWikiText = "For more details about the reputation system, visit the Bisq Wiki at:",
    bisqEasy_tradeWizard_amount_seller_limitInfo_noReputationNeededForMaxOrFixedAmount = "For amounts up to {0} no reputation is required.",
    bisqEasy_tradeWizard_amount_seller_limitInfo_noReputationNeededForMaxOrFixedAmount_overlay_info_scoreTooLow = "For amounts up to {0} the reputation requirements are relaxed.\n\n Your reputation score of {1} doesn''t offer sufficient security for buyers. However, given the low amount involved,  buyers might still consider accepting the offer once they are made aware of the associated risks.\n\n You can find information on how to increase your reputation at ''Reputation/Build Reputation''.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_learnMore = "Learn more",
    bisqEasy_tradeWizard_amount_buyer_numSellers_0 = "is no seller",
    bisqEasy_tradeWizard_amount_buyer_numSellers_1 = "is one seller",
    bisqEasy_tradeWizard_amount_buyer_numSellers_many = "are {0} sellers",
    bisqEasy_tradeWizard_amount_numOffers_0 = "is no offer",
    bisqEasy_tradeWizard_amount_numOffers_1 = "is one offer",
    bisqEasy_tradeWizard_amount_numOffers_many = { count -> "are $count offers" },
    bisqEasy_tradeWizard_amount_buyer_limitInfo = { sellers, currency -> "There $sellers in the network with sufficient reputation to take an offer of $currency." },
    bisqEasy_tradeWizard_amount_buyer_limitInfo_overlay_info = "A seller who wants to take your offer of {0}, must have a reputation score of at least {1}.\n By reducing the maximum trade amount, you make your offer accessible to more sellers.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_wizard_info_leadLine = "There {0} matching the chosen trade amount.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_wizard_info = "For offers up to {0}, reputation requirements are relaxed.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_wizard_overlay_info = "Given the low min. amount of {0}, the reputation requirements are relaxed.\n For amounts up to {1}, sellers do not need reputation.\n\n At the ''Select Offer'' screen it is recommended to choose sellers with higher reputation.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_noReputationNeededForMaxOrFixedAmount = "Sellers with no reputation can take offers up to {0}.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_noReputationNeededForMaxOrFixedAmount_riskInfo = "Be sure you fully understand the risks involved.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_overlay_noReputationNeededForMaxOrFixedAmount_info = "Given the low amount of {0}, reputation requirements are relaxed.\n For amounts up to {1}, sellers with insufficient or no reputation can take the offer.\n\n Be sure to fully understand the risks when trading with a seller without or insufficient reputation.  If you do not want to be exposed to that risk, choose an amount above {2}.",
    bisqEasy_tradeWizard_amount_buyer_limitInfo_overlay_linkToWikiText = "To learn more about the reputation system, visit:",
    bisqEasy_tradeWizard_amount_buyer_noReputationNeededForMinAmount_limitInfo_leadLine = "Since your min. amount is below {0}, sellers without reputation can take your offer.",
    bisqEasy_tradeWizard_amount_buyer_noReputationNeededForMinAmount_limitInfo = "For the max. amount of {0} there {1} with enough reputation to take your offer.",
    bisqEasy_tradeWizard_amount_buyer_noReputationNeededForMinAmount_limitInfo_overlay_info = "Given the low trade amount of {0}, the reputation requirements are relaxed.\n For amounts up to {1}, sellers with insufficient or no reputation can take your offer.\n\n Sellers who wants to take your offer with the max. amount of {2}, must have a reputation score of at least {3}.\n By reducing the maximum trade amount, you make your offer accessible to more sellers.",
    bisqEasy_tradeWizard_paymentMethods_headline = "Which payment and settlement methods do you want to use?",
    bisqEasy_tradeWizard_paymentMethods_fiat_subTitle_buyer = "Choose the payment methods to transfer {0}",
    bisqEasy_tradeWizard_paymentMethods_fiat_subTitle_seller = "Choose the payment methods to receive {0}",
    bisqEasy_tradeWizard_paymentMethods_bitcoin_subTitle_buyer = "Choose the settlement methods to receive Bitcoin",
    bisqEasy_tradeWizard_paymentMethods_bitcoin_subTitle_seller = "Choose the settlement methods to send Bitcoin",
    bisqEasy_tradeWizard_paymentMethods_noneFound = "For the selected market there are no default payment methods provided.\n Please add in the text field below the custom payment you want to use.",
    bisqEasy_tradeWizard_paymentMethods_customMethod_prompt = "Custom payment",
    bisqEasy_tradeWizard_paymentMethods_warn_maxMethodsReached = "You cannot add more than 4 payment methods.",
    bisqEasy_tradeWizard_paymentMethods_warn_tooLong = "A custom payment method name must not be longer than 20 characters.",
    bisqEasy_tradeWizard_paymentMethods_warn_customPaymentMethodAlreadyExists = "A custom payment method with name {0} already exists.",
    bisqEasy_tradeWizard_paymentMethods_warn_customNameMatchesPredefinedMethod = "The name of your custom payment method must not be the same as one of the predefined.",
    bisqEasy_tradeWizard_paymentMethods_warn_noFiatPaymentMethodSelected = "Please choose at least one fiat payment method.",
    bisqEasy_tradeWizard_paymentMethods_warn_noBtcSettlementMethodSelected = "Please choose at least one Bitcoin settlement method.",
    bisqEasy_tradeWizard_selectOffer_headline_buyer = "Buy Bitcoin for {0}",
    bisqEasy_tradeWizard_selectOffer_headline_seller = "Sell Bitcoin for {0}",
    bisqEasy_tradeWizard_selectOffer_subHeadline = "It is recommended to trade with users with high reputation.",
    bisqEasy_tradeWizard_selectOffer_noMatchingOffers_headline = "No matching offers found",
    bisqEasy_tradeWizard_selectOffer_noMatchingOffers_subHeadline = "There are no offers available for your selection criteria.",
    bisqEasy_tradeWizard_selectOffer_noMatchingOffers_goBack = "Change selection",
    bisqEasy_tradeWizard_selectOffer_noMatchingOffers_goBack_info = "Go back to the previous screens and change the selection",
    bisqEasy_tradeWizard_selectOffer_noMatchingOffers_browseOfferbook = "Browse offerbook",
    bisqEasy_tradeWizard_selectOffer_noMatchingOffers_browseOfferbook_info = "Close the trade wizard and browse the offer book",
    bisqEasy_tradeWizard_review_headline_maker = "Review offer",
    bisqEasy_tradeWizard_review_headline_taker = "Review trade",
    bisqEasy_tradeWizard_review_detailsHeadline_taker = "Trade details",
    bisqEasy_tradeWizard_review_detailsHeadline_maker = "Offer details",
    bisqEasy_tradeWizard_review_feeDescription = "Fees",
    bisqEasy_tradeWizard_review_noTradeFees = "No trade fees in Bisq Easy",
    bisqEasy_tradeWizard_review_sellerPaysMinerFeeLong = "The seller pays the mining fee",
    bisqEasy_tradeWizard_review_sellerPaysMinerFee = "Seller pays the mining fee",
    bisqEasy_tradeWizard_review_noTradeFeesLong = "There are no trade fees in Bisq Easy",
    bisqEasy_tradeWizard_review_toPay = "Amount to pay",
    bisqEasy_tradeWizard_review_toSend = "Amount to send",
    bisqEasy_tradeWizard_review_toReceive = "Amount to receive",
    bisqEasy_tradeWizard_review_direction = "{0} Bitcoin",
    bisqEasy_tradeWizard_review_paymentMethodDescription_btc = "Bitcoin settlement",
    bisqEasy_tradeWizard_review_paymentMethodDescriptions_btc_maker = "Bitcoin settlement methods",
    bisqEasy_tradeWizard_review_paymentMethodDescriptions_btc_taker = "Select Bitcoin settlement method",
    bisqEasy_tradeWizard_review_paymentMethodDescription_fiat = "Fiat payment",
    bisqEasy_tradeWizard_review_paymentMethodDescriptions_fiat_maker = "Fiat payment methods",
    bisqEasy_tradeWizard_review_paymentMethodDescriptions_fiat_taker = "Select fiat payment method",
    bisqEasy_tradeWizard_review_price = "{0} <{1} style=trade-wizard-review-code>",
    bisqEasy_tradeWizard_review_priceDescription_taker = "Trade price",
    bisqEasy_tradeWizard_review_priceDescription_maker = "Offer price",
    bisqEasy_tradeWizard_review_priceDetails_fix = "Fix price. {0} {1} market price of {2}",
    bisqEasy_tradeWizard_review_priceDetails_fix_atMarket = "Fix price. Same as market price of {0}",
    bisqEasy_tradeWizard_review_priceDetails_float = { percentage, direction, rate -> "Float price. $percentage $direction market price of $rate" },
    bisqEasy_tradeWizard_review_priceDetails = "Floats with the market price",
    bisqEasy_tradeWizard_review_nextButton_createOffer = "Create offer",
    bisqEasy_tradeWizard_review_nextButton_takeOffer = "Confirm trade",
    bisqEasy_tradeWizard_review_createOfferSuccess_headline = "Offer successfully published",
    bisqEasy_tradeWizard_review_createOfferSuccess_subTitle = "Your offer is now listed in the offerbook.  When a Bisq user takes your offer, you will find a new trade in the 'Open Trades' section.\n\n Be sure to regularly check the Bisq application for new messages from a taker.",
    bisqEasy_tradeWizard_review_createOfferSuccessButton = "Show my offer in 'Offerbook'",
    bisqEasy_tradeWizard_review_takeOfferSuccess_headline = "You have successfully taken the offer",
    bisqEasy_tradeWizard_review_takeOfferSuccess_subTitle = "Please get in touch with the trade peer at 'Open Trades'.\n You will find further information for the next steps over there.\n\n Be sure to regularly check the Bisq application for new messages from your trade peer.",
    bisqEasy_tradeWizard_review_takeOfferSuccessButton = "Show trade in 'Open Trades'",
    bisqEasy_tradeWizard_review_table_baseAmount_buyer = "You receive",
    bisqEasy_tradeWizard_review_table_baseAmount_seller = "You spend",
    bisqEasy_tradeWizard_review_table_price = "Price in {0}",
    bisqEasy_tradeWizard_review_table_reputation = "Reputation",
    bisqEasy_tradeWizard_review_chatMessage_fixPrice = "{0}",
    bisqEasy_tradeWizard_review_chatMessage_floatPrice_above = "{0} above market price",
    bisqEasy_tradeWizard_review_chatMessage_floatPrice_plus = "+{0}",
    bisqEasy_tradeWizard_review_chatMessage_floatPrice_below = "{0} below market price",
    bisqEasy_tradeWizard_review_chatMessage_floatPrice_minus = "-{0}",
    bisqEasy_tradeWizard_review_chatMessage_marketPrice = "Market price",
    bisqEasy_tradeWizard_review_chatMessage_price = "Price:",
    bisqEasy_tradeWizard_review_chatMessage_peerMessage_sell = "Sell Bitcoin to {0}\n Amount: {1}\n Bitcoin settlement method(s): {2}\n Fiat payment method(s): {3}\n {4}",
    bisqEasy_tradeWizard_review_chatMessage_peerMessage_buy = "Buy Bitcoin from {0}\n Amount: {1}\n Bitcoin settlement method(s): {2}\n Fiat payment method(s): {3}\n {4}",
    bisqEasy_tradeWizard_review_chatMessage_offerDetails = "Amount: {0}\n Bitcoin settlement method(s): {1}\n Fiat payment method(s): {2}\n {3}",
    bisqEasy_tradeWizard_review_chatMessage_peerMessageTitle_sell = "Sell Bitcoin to",
    bisqEasy_tradeWizard_review_chatMessage_peerMessageTitle_buy = "Buy Bitcoin from",
    bisqEasy_tradeWizard_review_chatMessage_myMessageTitle = "My Offer to {0} Bitcoin",

    bisqEasy_tradeWizard_buy_description = "The easiest way to get your first Bitcoin",
    bisqEasy_tradeWizard_sell_description = "Experienced Bisq users with reputation can act as seller",

    bisqEasy_tradeWizard_trade_amount = "Trade amount",
    bisqEasy_tradeWizard_fixed_amount = "Fixed amount",
    bisqEasy_tradeWizard_range_amount = "Range amount",

    bisqEasy_tradeWizard_trade_price_percentage = "Percentage",
    bisqEasy_tradeWizard_trade_price_fixed = "Fixed",
)
