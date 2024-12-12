package network.bisq.mobile.i18n

// Can't have 500+ (or even less) keys in a single class. So splitting it up
// Partial from BisqEasyStrings.kt
data class BisqEasyTradeWizardStrings(
    val bisqEasy_tradeWizard_progress_directionAndMarket: String,
    val bisqEasy_tradeWizard_progress_price: String,
    val bisqEasy_tradeWizard_progress_amount: String,
    val bisqEasy_tradeWizard_progress_paymentMethods: String,
    val bisqEasy_tradeWizard_progress_takeOffer: String,
    val bisqEasy_tradeWizard_progress_review: String,
    val bisqEasy_tradeWizard_directionAndMarket_headline: String,
    val bisqEasy_tradeWizard_directionAndMarket_buy: String,
    val bisqEasy_tradeWizard_directionAndMarket_sell: String,
    val bisqEasy_tradeWizard_directionAndMarket_feedback_headline: String,
    val bisqEasy_tradeWizard_directionAndMarket_feedback_subTitle1: String,
    val bisqEasy_tradeWizard_directionAndMarket_feedback_gainReputation: String,
    val bisqEasy_tradeWizard_directionAndMarket_feedback_subTitle2: String,
    val bisqEasy_tradeWizard_directionAndMarket_feedback_tradeWithoutReputation: String,
    val bisqEasy_tradeWizard_directionAndMarket_feedback_backToBuy: String,
    val bisqEasy_tradeWizard_market_headline_buyer: String,
    val bisqEasy_tradeWizard_market_headline_seller: String,
    val bisqEasy_tradeWizard_market_subTitle: String,
    val bisqEasy_tradeWizard_market_columns_name: String,
    val bisqEasy_tradeWizard_market_columns_numOffers: String,
    val bisqEasy_tradeWizard_market_columns_numPeers: String,
    val bisqEasy_price_headline: String,
    val bisqEasy_tradeWizard_price_subtitle: String,
    val bisqEasy_price_percentage_title: String,
    val bisqEasy_price_percentage_inputBoxText: String,
    val bisqEasy_price_tradePrice_title: String,
    val bisqEasy_price_tradePrice_inputBoxText: (String) -> String,
    val bisqEasy_price_feedback_sentence: String,
    val bisqEasy_price_feedback_sentence_veryLow: String,
    val bisqEasy_price_feedback_sentence_low: String,
    val bisqEasy_price_feedback_sentence_some: String,
    val bisqEasy_price_feedback_sentence_good: String,
    val bisqEasy_price_feedback_sentence_veryGood: String,
    val bisqEasy_price_feedback_learnWhySection_openButton: String,
    val bisqEasy_price_feedback_learnWhySection_closeButton: String,
    val bisqEasy_price_feedback_learnWhySection_title: String,
    val bisqEasy_price_feedback_learnWhySection_description_intro: String,
    val bisqEasy_price_feedback_learnWhySection_description_exposition: String,
    val bisqEasy_price_warn_invalidPrice_outOfRange: String,
    val bisqEasy_price_warn_invalidPrice_numberFormatException: String,
    val bisqEasy_price_warn_invalidPrice_exception: String,
    val bisqEasy_tradeWizard_amount_headline_buyer: String,
    val bisqEasy_tradeWizard_amount_headline_seller: String,
    val bisqEasy_tradeWizard_amount_description_minAmount: String,
    val bisqEasy_tradeWizard_amount_description_maxAmount: String,
    val bisqEasy_tradeWizard_amount_description_fixAmount: String,
    val bisqEasy_tradeWizard_amount_addMinAmountOption: String,
    val bisqEasy_tradeWizard_amount_removeMinAmountOption: String,
    val bisqEasy_component_amount_minRangeValue: String,
    val bisqEasy_component_amount_maxRangeValue: String,
    val bisqEasy_component_amount_baseSide_tooltip_btcAmount_marketPrice: String,
    val bisqEasy_component_amount_baseSide_tooltip_btcAmount_selectedPrice: String,
    val bisqEasy_component_amount_baseSide_tooltip_buyerInfo: String,
    val bisqEasy_component_amount_baseSide_tooltip_bestOfferPrice: String,
    val bisqEasy_component_amount_baseSide_tooltip_buyer_btcAmount: String,
    val bisqEasy_component_amount_baseSide_tooltip_seller_btcAmount: String,
    val bisqEasy_component_amount_baseSide_tooltip_taker_offerPrice: String,
    val bisqEasy_tradeWizard_amount_limitInfo_overlay_headline: String,
    val bisqEasy_tradeWizard_amount_limitInfo_overlay_close: String,
    val bisqEasy_tradeWizard_amount_seller_wizard_numMatchingOffers_info: String,
    val bisqEasy_tradeWizard_amount_seller_wizard_limitInfo: String,
    val bisqEasy_tradeWizard_amount_seller_wizard_limitInfo_overlay_info: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_scoreTooLow: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_info_scoreTooLow: String,
    val bisqEasy_takeOffer_amount_seller_limitInfo_lowToleratedAmount: String,
    val bisqEasy_takeOffer_amount_seller_limitInfo_scoreTooLow: String,
    val bisqEasy_takeOffer_amount_seller_limitInfo_overlay_info_scoreTooLow: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_sufficientScore: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_info_sufficientScore: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_inSufficientScore: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_info_inSufficientScore: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfoAmount: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_link: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_overlay_linkToWikiText: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_noReputationNeededForMaxOrFixedAmount: String,
    val bisqEasy_tradeWizard_amount_seller_limitInfo_noReputationNeededForMaxOrFixedAmount_overlay_info_scoreTooLow: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_learnMore: String,
    val bisqEasy_tradeWizard_amount_buyer_numSellers_0: String,
    val bisqEasy_tradeWizard_amount_buyer_numSellers_1: String,
    val bisqEasy_tradeWizard_amount_buyer_numSellers_many: String,
    val bisqEasy_tradeWizard_amount_numOffers_0: String,
    val bisqEasy_tradeWizard_amount_numOffers_1: String,
    val bisqEasy_tradeWizard_amount_numOffers_many: (String) -> String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo:  (String, String) -> String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_overlay_info: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_wizard_info_leadLine: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_wizard_info: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_wizard_overlay_info: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_noReputationNeededForMaxOrFixedAmount: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_noReputationNeededForMaxOrFixedAmount_riskInfo: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_overlay_noReputationNeededForMaxOrFixedAmount_info: String,
    val bisqEasy_tradeWizard_amount_buyer_limitInfo_overlay_linkToWikiText: String,
    val bisqEasy_tradeWizard_amount_buyer_noReputationNeededForMinAmount_limitInfo_leadLine: String,
    val bisqEasy_tradeWizard_amount_buyer_noReputationNeededForMinAmount_limitInfo: String,
    val bisqEasy_tradeWizard_amount_buyer_noReputationNeededForMinAmount_limitInfo_overlay_info: String,
    val bisqEasy_tradeWizard_paymentMethods_headline: String,
    val bisqEasy_tradeWizard_paymentMethods_fiat_subTitle_buyer: String,
    val bisqEasy_tradeWizard_paymentMethods_fiat_subTitle_seller: String,
    val bisqEasy_tradeWizard_paymentMethods_bitcoin_subTitle_buyer: String,
    val bisqEasy_tradeWizard_paymentMethods_bitcoin_subTitle_seller: String,
    val bisqEasy_tradeWizard_paymentMethods_noneFound: String,
    val bisqEasy_tradeWizard_paymentMethods_customMethod_prompt: String,
    val bisqEasy_tradeWizard_paymentMethods_warn_maxMethodsReached: String,
    val bisqEasy_tradeWizard_paymentMethods_warn_tooLong: String,
    val bisqEasy_tradeWizard_paymentMethods_warn_customPaymentMethodAlreadyExists: String,
    val bisqEasy_tradeWizard_paymentMethods_warn_customNameMatchesPredefinedMethod: String,
    val bisqEasy_tradeWizard_paymentMethods_warn_noFiatPaymentMethodSelected: String,
    val bisqEasy_tradeWizard_paymentMethods_warn_noBtcSettlementMethodSelected: String,
    val bisqEasy_tradeWizard_selectOffer_headline_buyer: String,
    val bisqEasy_tradeWizard_selectOffer_headline_seller: String,
    val bisqEasy_tradeWizard_selectOffer_subHeadline: String,
    val bisqEasy_tradeWizard_selectOffer_noMatchingOffers_headline: String,
    val bisqEasy_tradeWizard_selectOffer_noMatchingOffers_subHeadline: String,
    val bisqEasy_tradeWizard_selectOffer_noMatchingOffers_goBack: String,
    val bisqEasy_tradeWizard_selectOffer_noMatchingOffers_goBack_info: String,
    val bisqEasy_tradeWizard_selectOffer_noMatchingOffers_browseOfferbook: String,
    val bisqEasy_tradeWizard_selectOffer_noMatchingOffers_browseOfferbook_info: String,
    val bisqEasy_tradeWizard_review_headline_maker: String,
    val bisqEasy_tradeWizard_review_headline_taker: String,
    val bisqEasy_tradeWizard_review_detailsHeadline_taker: String,
    val bisqEasy_tradeWizard_review_detailsHeadline_maker: String,
    val bisqEasy_tradeWizard_review_feeDescription: String,
    val bisqEasy_tradeWizard_review_noTradeFees: String,
    val bisqEasy_tradeWizard_review_sellerPaysMinerFeeLong: String,
    val bisqEasy_tradeWizard_review_sellerPaysMinerFee: String,
    val bisqEasy_tradeWizard_review_noTradeFeesLong: String,
    val bisqEasy_tradeWizard_review_toPay: String,
    val bisqEasy_tradeWizard_review_toSend: String,
    val bisqEasy_tradeWizard_review_toReceive: String,
    val bisqEasy_tradeWizard_review_direction: String,
    val bisqEasy_tradeWizard_review_paymentMethodDescription_btc: String,
    val bisqEasy_tradeWizard_review_paymentMethodDescriptions_btc_maker: String,
    val bisqEasy_tradeWizard_review_paymentMethodDescriptions_btc_taker: String,
    val bisqEasy_tradeWizard_review_paymentMethodDescription_fiat: String,
    val bisqEasy_tradeWizard_review_paymentMethodDescriptions_fiat_maker: String,
    val bisqEasy_tradeWizard_review_paymentMethodDescriptions_fiat_taker: String,
    val bisqEasy_tradeWizard_review_price: String,
    val bisqEasy_tradeWizard_review_priceDescription_taker: String,
    val bisqEasy_tradeWizard_review_priceDescription_maker: String,
    val bisqEasy_tradeWizard_review_priceDetails_fix: String,
    val bisqEasy_tradeWizard_review_priceDetails_fix_atMarket: String,
    val bisqEasy_tradeWizard_review_priceDetails_float: (String, String, String) -> String,
    val bisqEasy_tradeWizard_review_priceDetails: String,
    val bisqEasy_tradeWizard_review_nextButton_createOffer: String,
    val bisqEasy_tradeWizard_review_nextButton_takeOffer: String,
    val bisqEasy_tradeWizard_review_createOfferSuccess_headline: String,
    val bisqEasy_tradeWizard_review_createOfferSuccess_subTitle: String,
    val bisqEasy_tradeWizard_review_createOfferSuccessButton: String,
    val bisqEasy_tradeWizard_review_takeOfferSuccess_headline: String,
    val bisqEasy_tradeWizard_review_takeOfferSuccess_subTitle: String,
    val bisqEasy_tradeWizard_review_takeOfferSuccessButton: String,
    val bisqEasy_tradeWizard_review_table_baseAmount_buyer: String,
    val bisqEasy_tradeWizard_review_table_baseAmount_seller: String,
    val bisqEasy_tradeWizard_review_table_price: String,
    val bisqEasy_tradeWizard_review_table_reputation: String,
    val bisqEasy_tradeWizard_review_chatMessage_fixPrice: String,
    val bisqEasy_tradeWizard_review_chatMessage_floatPrice_above: String,
    val bisqEasy_tradeWizard_review_chatMessage_floatPrice_plus: String,
    val bisqEasy_tradeWizard_review_chatMessage_floatPrice_below: String,
    val bisqEasy_tradeWizard_review_chatMessage_floatPrice_minus: String,
    val bisqEasy_tradeWizard_review_chatMessage_marketPrice: String,
    val bisqEasy_tradeWizard_review_chatMessage_price: String,
    val bisqEasy_tradeWizard_review_chatMessage_peerMessage_sell: String,
    val bisqEasy_tradeWizard_review_chatMessage_peerMessage_buy: String,
    val bisqEasy_tradeWizard_review_chatMessage_offerDetails: String,
    val bisqEasy_tradeWizard_review_chatMessage_peerMessageTitle_sell: String,
    val bisqEasy_tradeWizard_review_chatMessage_peerMessageTitle_buy: String,
    val bisqEasy_tradeWizard_review_chatMessage_myMessageTitle: String,

    // Mobile app specific
    val bisqEasy_tradeWizard_buy_description: String,
    val bisqEasy_tradeWizard_sell_description: String,
    val bisqEasy_tradeWizard_trade_amount: String,
    val bisqEasy_tradeWizard_fixed_amount: String,
    val bisqEasy_tradeWizard_range_amount: String,
    val bisqEasy_tradeWizard_trade_price_percentage: String,
    val bisqEasy_tradeWizard_trade_price_fixed: String,

)
