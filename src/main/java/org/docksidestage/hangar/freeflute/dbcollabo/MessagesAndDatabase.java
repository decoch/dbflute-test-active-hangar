package org.docksidestage.hangar.freeflute.dbcollabo;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ResourceBundle;

/**
 * @author FreeGen
 */
public class MessagesAndDatabase implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle("application");

    // MEMBER
    //  - MEMBER_ID
    //  - MEMBER_NAME
    //  - MEMBER_ACCOUNT
    //  - MEMBER_STATUS_CODE
    //  - FORMALIZED_DATETIME
    //  - BIRTHDATE
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    //  - VERSION_NO
    // MEMBER_ADDRESS
    //  - MEMBER_ADDRESS_ID
    //  - MEMBER_ID
    //  - VALID_BEGIN_DATE
    //  - VALID_END_DATE
    //  - ADDRESS
    //  - REGION_ID
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    //  - VERSION_NO
    // MEMBER_FOLLOWING
    //  - MEMBER_FOLLOWING_ID
    //  - MY_MEMBER_ID
    //  - YOUR_MEMBER_ID
    //  - FOLLOW_DATETIME
    // MEMBER_LOGIN
    //  - MEMBER_LOGIN_ID
    //  - MEMBER_ID
    //  - LOGIN_DATETIME
    //  - MOBILE_LOGIN_FLG
    //  - LOGIN_MEMBER_STATUS_CODE
    // MEMBER_SECURITY
    //  - MEMBER_ID
    //  - LOGIN_PASSWORD
    //  - REMINDER_QUESTION
    //  - REMINDER_ANSWER
    //  - REMINDER_USE_COUNT
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    //  - VERSION_NO
    // MEMBER_SERVICE
    //  - MEMBER_SERVICE_ID
    //  - MEMBER_ID
    //  - SERVICE_POINT_COUNT
    //  - SERVICE_RANK_CODE
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    //  - VERSION_NO
    // MEMBER_STATUS
    //  - MEMBER_STATUS_CODE
    //  - MEMBER_STATUS_NAME
    //  - DESCRIPTION
    //  - DISPLAY_ORDER
    // MEMBER_WITHDRAWAL
    //  - MEMBER_ID
    //  - WITHDRAWAL_REASON_CODE
    //  - WITHDRAWAL_REASON_INPUT_TEXT
    //  - WITHDRAWAL_DATETIME
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    // PRODUCT
    //  - PRODUCT_ID
    //  - PRODUCT_NAME
    //  - PRODUCT_HANDLE_CODE
    //  - PRODUCT_CATEGORY_CODE
    //  - PRODUCT_STATUS_CODE
    //  - REGULAR_PRICE
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    //  - VERSION_NO
    // PRODUCT_CATEGORY
    //  - PRODUCT_CATEGORY_CODE
    //  - PRODUCT_CATEGORY_NAME
    //  - PARENT_CATEGORY_CODE
    // PRODUCT_STATUS
    //  - PRODUCT_STATUS_CODE
    //  - PRODUCT_STATUS_NAME
    //  - DISPLAY_ORDER
    // PURCHASE
    //  - PURCHASE_ID
    //  - MEMBER_ID
    //  - PRODUCT_ID
    //  - PURCHASE_DATETIME
    //  - PURCHASE_COUNT
    //  - PURCHASE_PRICE
    //  - PAYMENT_COMPLETE_FLG
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    //  - VERSION_NO
    // PURCHASE_PAYMENT
    //  - PURCHASE_PAYMENT_ID
    //  - PURCHASE_ID
    //  - PAYMENT_AMOUNT
    //  - PAYMENT_DATETIME
    //  - PAYMENT_METHOD_CODE
    //  - REGISTER_DATETIME
    //  - REGISTER_USER
    //  - UPDATE_DATETIME
    //  - UPDATE_USER
    // REGION
    //  - REGION_ID
    //  - REGION_NAME
    // SERVICE_RANK
    //  - SERVICE_RANK_CODE
    //  - SERVICE_RANK_NAME
    //  - SERVICE_POINT_INCIDENCE
    //  - NEW_ACCEPTABLE_FLG
    //  - DESCRIPTION
    //  - DISPLAY_ORDER
    // SUMMARY_PRODUCT
    //  - PRODUCT_ID
    //  - PRODUCT_NAME
    //  - PRODUCT_HANDLE_CODE
    //  - PRODUCT_STATUS_CODE
    //  - LATEST_PURCHASE_DATETIME
    // SUMMARY_WITHDRAWAL
    //  - MEMBER_ID
    //  - MEMBER_NAME
    //  - WITHDRAWAL_REASON_CODE
    //  - WITHDRAWAL_REASON_TEXT
    //  - WITHDRAWAL_REASON_INPUT_TEXT
    //  - WITHDRAWAL_DATETIME
    //  - MEMBER_STATUS_CODE
    //  - MEMBER_STATUS_NAME
    //  - MAX_PURCHASE_PRICE
    // VENDOR_$_DOLLAR
    //  - VENDOR_$_DOLLAR_ID
    //  - VENDOR_$_DOLLAR_NAME
    // VENDOR_CHECK
    //  - VENDOR_CHECK_ID
    //  - TYPE_OF_CHAR
    //  - TYPE_OF_VARCHAR
    //  - TYPE_OF_CLOB
    //  - TYPE_OF_TEXT
    //  - TYPE_OF_NUMERIC_INTEGER
    //  - TYPE_OF_NUMERIC_BIGINT
    //  - TYPE_OF_NUMERIC_DECIMAL
    //  - TYPE_OF_NUMERIC_INTEGER_MIN
    //  - TYPE_OF_NUMERIC_INTEGER_MAX
    //  - TYPE_OF_NUMERIC_BIGINT_MIN
    //  - TYPE_OF_NUMERIC_BIGINT_MAX
    //  - TYPE_OF_NUMERIC_SUPERINT_MIN
    //  - TYPE_OF_NUMERIC_SUPERINT_MAX
    //  - TYPE_OF_NUMERIC_MAXDECIMAL
    //  - TYPE_OF_INTEGER
    //  - TYPE_OF_BIGINT
    //  - TYPE_OF_DATE
    //  - TYPE_OF_TIMESTAMP
    //  - TYPE_OF_TIME
    //  - TYPE_OF_BOOLEAN
    //  - TYPE_OF_BINARY
    //  - TYPE_OF_BLOB
    //  - TYPE_OF_UUID
    //  - TYPE_OF_ARRAY
    //  - TYPE_OF_OTHER
    //  - J_A_V_A_BEANS_PROPERTY
    //  - J_POP_BEANS_PROPERTY
    // VENDOR_IDENTITY_ONLY
    //  - IDENTITY_ONLY_ID
    // VENDOR_PRIMARY_KEY_ONLY
    //  - PRIMARY_KEY_ONLY_ID
    // VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN
    //  - THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
    //  - THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME
    //  - SHORT_NAME
    //  - SHORT_SIZE
    // VENDOR_THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF
    //  - THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_ID
    //  - THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID
    //  - THE_LONG_AND_WINDING_TABLE_AND_COLUMN_REF_DATE
    //  - SHORT_DATE
    // WHITE_DATE_TERM
    //  - DATE_TERM_ID
    //  - DATE_TERM_VALUE
    //  - BEGIN_DATE
    //  - END_DATE
    // WHITE_TSV_LOADING
    //  - TSV_LOADING_ID
    //  - TSV_LOADING_NAME
    //  - LOADING_COUNT
    //  - LOADING_DATE
    //  - BEGIN_DATETIME
    //  - END_DATETIME
    //  - DONE_FLG
    // WITHDRAWAL_REASON
    //  - WITHDRAWAL_REASON_CODE
    //  - WITHDRAWAL_REASON_TEXT
    //  - DISPLAY_ORDER


    /** , name=ErrorsHeader, variable=0 */
    public static final String ERRORS_HEADER = "errors.header";
    /**
     * value=&lt;font color="red"&gt;&lt;ul&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsHeader() { // <font color="red"><ul>
        return MessageFormat.format(BUNDLE.getString(ERRORS_HEADER), (Object[])null);
    }

    /** , name=ErrorsFooter, variable=0 */
    public static final String ERRORS_FOOTER = "errors.footer";
    /**
     * value=&lt;/ul&gt;&lt;/font&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsFooter() { // </ul></font>
        return MessageFormat.format(BUNDLE.getString(ERRORS_FOOTER), (Object[])null);
    }

    /** , name=ErrorsPrefix, variable=0 */
    public static final String ERRORS_PREFIX = "errors.prefix";
    /**
     * value=&lt;li&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsPrefix() { // <li>
        return MessageFormat.format(BUNDLE.getString(ERRORS_PREFIX), (Object[])null);
    }

    /** , name=ErrorsSuffix, variable=0 */
    public static final String ERRORS_SUFFIX = "errors.suffix";
    /**
     * value=&lt;/li&gt;
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsSuffix() { // </li>
        return MessageFormat.format(BUNDLE.getString(ERRORS_SUFFIX), (Object[])null);
    }

    /** , name=ErrorsInvalid, variable=1 */
    public static final String ERRORS_INVALID = "errors.invalid";
    /**
     * value={0} is invalid.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsInvalid(String arg0) { // {0} is invalid.
        return MessageFormat.format(BUNDLE.getString(ERRORS_INVALID), arg0);
    }

    /** , name=ErrorsMaxlength, variable=2 */
    public static final String ERRORS_MAXLENGTH = "errors.maxlength";
    /**
     * value={0} can not be greater than {1} characters.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMaxlength(String arg0, String arg1) { // {0} can not be greater than {1} characters.
        return MessageFormat.format(BUNDLE.getString(ERRORS_MAXLENGTH), arg0, arg1);
    }

    /** , name=ErrorsMinlength, variable=2 */
    public static final String ERRORS_MINLENGTH = "errors.minlength";
    /**
     * value={0} can not be less than {1} characters.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMinlength(String arg0, String arg1) { // {0} can not be less than {1} characters.
        return MessageFormat.format(BUNDLE.getString(ERRORS_MINLENGTH), arg0, arg1);
    }

    /** , name=ErrorsMaxbytelength, variable=2 */
    public static final String ERRORS_MAXBYTELENGTH = "errors.maxbytelength";
    /**
     * value={0} can not be greater than {1} bytes.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMaxbytelength(String arg0, String arg1) { // {0} can not be greater than {1} bytes.
        return MessageFormat.format(BUNDLE.getString(ERRORS_MAXBYTELENGTH), arg0, arg1);
    }

    /** , name=ErrorsMinbytelength, variable=2 */
    public static final String ERRORS_MINBYTELENGTH = "errors.minbytelength";
    /**
     * value={0} can not be less than {1} bytes.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsMinbytelength(String arg0, String arg1) { // {0} can not be less than {1} bytes.
        return MessageFormat.format(BUNDLE.getString(ERRORS_MINBYTELENGTH), arg0, arg1);
    }

    /** , name=ErrorsRange, variable=3 */
    public static final String ERRORS_RANGE = "errors.range";
    /**
     * value={0} is not in the range {1} through {2}.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @param arg2 The parameter 2 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsRange(String arg0, String arg1, String arg2) { // {0} is not in the range {1} through {2}.
        return MessageFormat.format(BUNDLE.getString(ERRORS_RANGE), arg0, arg1, arg2);
    }

    /** , name=ErrorsRequired, variable=1 */
    public static final String ERRORS_REQUIRED = "errors.required";
    /**
     * value={0} is required.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsRequired(String arg0) { // {0} is required.
        return MessageFormat.format(BUNDLE.getString(ERRORS_REQUIRED), arg0);
    }

    /** , name=ErrorsByte, variable=1 */
    public static final String ERRORS_BYTE = "errors.byte";
    /**
     * value={0} must be an byte.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsByte(String arg0) { // {0} must be an byte.
        return MessageFormat.format(BUNDLE.getString(ERRORS_BYTE), arg0);
    }

    /** , name=ErrorsDate, variable=1 */
    public static final String ERRORS_DATE = "errors.date";
    /**
     * value={0} is not a date.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsDate(String arg0) { // {0} is not a date.
        return MessageFormat.format(BUNDLE.getString(ERRORS_DATE), arg0);
    }

    /** , name=ErrorsDouble, variable=1 */
    public static final String ERRORS_DOUBLE = "errors.double";
    /**
     * value={0} must be an double.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsDouble(String arg0) { // {0} must be an double.
        return MessageFormat.format(BUNDLE.getString(ERRORS_DOUBLE), arg0);
    }

    /** , name=ErrorsFloat, variable=1 */
    public static final String ERRORS_FLOAT = "errors.float";
    /**
     * value={0} must be an float.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsFloat(String arg0) { // {0} must be an float.
        return MessageFormat.format(BUNDLE.getString(ERRORS_FLOAT), arg0);
    }

    /** , name=ErrorsInteger, variable=1 */
    public static final String ERRORS_INTEGER = "errors.integer";
    /**
     * value={0} must be an integer.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsInteger(String arg0) { // {0} must be an integer.
        return MessageFormat.format(BUNDLE.getString(ERRORS_INTEGER), arg0);
    }

    /** , name=ErrorsLong, variable=1 */
    public static final String ERRORS_LONG = "errors.long";
    /**
     * value={0} must be an long.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsLong(String arg0) { // {0} must be an long.
        return MessageFormat.format(BUNDLE.getString(ERRORS_LONG), arg0);
    }

    /** , name=ErrorsShort, variable=1 */
    public static final String ERRORS_SHORT = "errors.short";
    /**
     * value={0} must be an short.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsShort(String arg0) { // {0} must be an short.
        return MessageFormat.format(BUNDLE.getString(ERRORS_SHORT), arg0);
    }

    /** , name=ErrorsCreditcard, variable=1 */
    public static final String ERRORS_CREDITCARD = "errors.creditcard";
    /**
     * value={0} is not a valid credit card number.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsCreditcard(String arg0) { // {0} is not a valid credit card number.
        return MessageFormat.format(BUNDLE.getString(ERRORS_CREDITCARD), arg0);
    }

    /** , name=ErrorsEmail, variable=1 */
    public static final String ERRORS_EMAIL = "errors.email";
    /**
     * value={0} is an invalid e-mail address.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsEmail(String arg0) { // {0} is an invalid e-mail address.
        return MessageFormat.format(BUNDLE.getString(ERRORS_EMAIL), arg0);
    }

    /** , name=ErrorsUrl, variable=1 */
    public static final String ERRORS_URL = "errors.url";
    /**
     * value={0} is an invalid url (web address).
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsUrl(String arg0) { // {0} is an invalid url (web address).
        return MessageFormat.format(BUNDLE.getString(ERRORS_URL), arg0);
    }

    /** -------------, name=ErrorsNumber, variable=1 */
    public static final String ERRORS_NUMBER = "errors.number";
    /**
     * value=input number for {0}
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsNumber(String arg0) { // input number for {0}
        return MessageFormat.format(BUNDLE.getString(ERRORS_NUMBER), arg0);
    }

    /** , name=ErrorsSameValue, variable=1 */
    public static final String ERRORS_SAME_VALUE = "errors.same.value";
    /**
     * value=same value is selected in {0}
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsSameValue(String arg0) { // same value is selected in {0}
        return MessageFormat.format(BUNDLE.getString(ERRORS_SAME_VALUE), arg0);
    }

    /** , name=ErrorsGreaterThan, variable=2 */
    public static final String ERRORS_GREATER_THAN = "errors.greater.than";
    /**
     * value=input {0} greater than {1}
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsGreaterThan(String arg0, String arg1) { // input {0} greater than {1}
        return MessageFormat.format(BUNDLE.getString(ERRORS_GREATER_THAN), arg0, arg1);
    }

    /** , name=ErrorsRequiredAtLeastOne, variable=1 */
    public static final String ERRORS_REQUIRED_AT_LEAST_ONE = "errors.required.at.least.one";
    /**
     * value=input {0} at least one
     * @param arg0 The parameter 0 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsRequiredAtLeastOne(String arg0) { // input {0} at least one
        return MessageFormat.format(BUNDLE.getString(ERRORS_REQUIRED_AT_LEAST_ONE), arg0);
    }

    /** , name=ErrorsRequiredOr, variable=2 */
    public static final String ERRORS_REQUIRED_OR = "errors.required.or";
    /**
     * value=input either {0} or {1}
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsRequiredOr(String arg0, String arg1) { // input either {0} or {1}
        return MessageFormat.format(BUNDLE.getString(ERRORS_REQUIRED_OR), arg0, arg1);
    }

    /** , name=ErrorsUploadSize, variable=2 */
    public static final String ERRORS_UPLOAD_SIZE = "errors.upload.size";
    /**
     * value=Uploading failed, because actual size {0} bytes exceeded limit size {1} bytes.
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsUploadSize(String arg0, String arg1) { // Uploading failed, because actual size {0} bytes exceeded limit size {1} bytes.
        return MessageFormat.format(BUNDLE.getString(ERRORS_UPLOAD_SIZE), arg0, arg1);
    }

    /** ----------------, name=ErrorsEmptyLogin, variable=0 */
    public static final String ERRORS_EMPTY_LOGIN = "errors.empty.login";
    /**
     * value=input mail address or password
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsEmptyLogin() { // input mail address or password
        return MessageFormat.format(BUNDLE.getString(ERRORS_EMPTY_LOGIN), (Object[])null);
    }

    /** , name=ErrorsNotLogin, variable=0 */
    public static final String ERRORS_NOT_LOGIN = "errors.not.login";
    /**
     * value=invalid mail address or password
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsNotLogin() { // invalid mail address or password
        return MessageFormat.format(BUNDLE.getString(ERRORS_NOT_LOGIN), (Object[])null);
    }

    /** , name=ErrorsEmailExists, variable=0 */
    public static final String ERRORS_EMAIL_EXISTS = "errors.email.exists";
    /**
     * value=mail address already registered
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsEmailExists() { // mail address already registered
        return MessageFormat.format(BUNDLE.getString(ERRORS_EMAIL_EXISTS), (Object[])null);
    }

    /** , name=ErrorsAlreadyRegistered, variable=2 */
    public static final String ERRORS_ALREADY_REGISTERED = "errors.already.registered";
    /**
     * value={0} is already-regsitered {1}
     * @param arg0 The parameter 0 for message. (NotNull)
     * @param arg1 The parameter 1 for message. (NotNull)
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsAlreadyRegistered(String arg0, String arg1) { // {0} is already-regsitered {1}
        return MessageFormat.format(BUNDLE.getString(ERRORS_ALREADY_REGISTERED), arg0, arg1);
    }

    /** ---------------------, name=ErrorsAppIllegalTransition, variable=0 */
    public static final String ERRORS_APP_ILLEGAL_TRANSITION = "errors.app.illegal.transition";
    /**
     * value=retry because of illegal transition
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsAppIllegalTransition() { // retry because of illegal transition
        return MessageFormat.format(BUNDLE.getString(ERRORS_APP_ILLEGAL_TRANSITION), (Object[])null);
    }

    /** , name=ErrorsAppAlreadyDeleted, variable=0 */
    public static final String ERRORS_APP_ALREADY_DELETED = "errors.app.already.deleted";
    /**
     * value=others might be updated, so retry
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsAppAlreadyDeleted() { // others might be updated, so retry
        return MessageFormat.format(BUNDLE.getString(ERRORS_APP_ALREADY_DELETED), (Object[])null);
    }

    /** , name=ErrorsAppAlreadyUpdated, variable=0 */
    public static final String ERRORS_APP_ALREADY_UPDATED = "errors.app.already.updated";
    /**
     * value=others might be updated, so retry
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsAppAlreadyUpdated() { // others might be updated, so retry
        return MessageFormat.format(BUNDLE.getString(ERRORS_APP_ALREADY_UPDATED), (Object[])null);
    }

    /** , name=ErrorsAppAlreadyExists, variable=0 */
    public static final String ERRORS_APP_ALREADY_EXISTS = "errors.app.already.exists";
    /**
     * value=already existing data, so retry
     * @return The formatted message. (NotNull)
     */
    public static String getErrorsAppAlreadyExists() { // already existing data, so retry
        return MessageFormat.format(BUNDLE.getString(ERRORS_APP_ALREADY_EXISTS), (Object[])null);
    }

    /** ------, name=LabelsMember, variable=0 */
    public static final String LABELS_MEMBER = "labels.member";
    /**
     * value=Member
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsMember() { // Member
        return MessageFormat.format(BUNDLE.getString(LABELS_MEMBER), (Object[])null);
    }

    /** ---------, name=LabelsMemberId, variable=0 */
    public static final String LABELS_MEMBER_ID = "labels.memberId";
    /**
     * value=Member ID
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsMemberId() { // Member ID
        return MessageFormat.format(BUNDLE.getString(LABELS_MEMBER_ID), (Object[])null);
    }

    /** , name=LabelsMemberName, variable=0 */
    public static final String LABELS_MEMBER_NAME = "labels.memberName";
    /**
     * value=Member Name
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsMemberName() { // Member Name
        return MessageFormat.format(BUNDLE.getString(LABELS_MEMBER_NAME), (Object[])null);
    }

    /** , name=LabelsEmail, variable=0 */
    public static final String LABELS_EMAIL = "labels.email";
    /**
     * value=Mail Address
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsEmail() { // Mail Address
        return MessageFormat.format(BUNDLE.getString(LABELS_EMAIL), (Object[])null);
    }

    /** , name=LabelsEmailOrAccount, variable=0 */
    public static final String LABELS_EMAIL_OR_ACCOUNT = "labels.emailOrAccount";
    /**
     * value=Mail or Account
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsEmailOrAccount() { // Mail or Account
        return MessageFormat.format(BUNDLE.getString(LABELS_EMAIL_OR_ACCOUNT), (Object[])null);
    }

    /** , name=LabelsPassword, variable=0 */
    public static final String LABELS_PASSWORD = "labels.password";
    /**
     * value=Password
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsPassword() { // Password
        return MessageFormat.format(BUNDLE.getString(LABELS_PASSWORD), (Object[])null);
    }

    /** , name=LabelsVersionNo, variable=0 */
    public static final String LABELS_VERSION_NO = "labels.versionNo";
    /**
     * value=Version No
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsVersionNo() { // Version No
        return MessageFormat.format(BUNDLE.getString(LABELS_VERSION_NO), (Object[])null);
    }

    /** ------, name=LabelsList, variable=0 */
    public static final String LABELS_LIST = "labels.list";
    /**
     * value=List
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsList() { // List
        return MessageFormat.format(BUNDLE.getString(LABELS_LIST), (Object[])null);
    }

    /** , name=LabelsEdit, variable=0 */
    public static final String LABELS_EDIT = "labels.edit";
    /**
     * value=Edit
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsEdit() { // Edit
        return MessageFormat.format(BUNDLE.getString(LABELS_EDIT), (Object[])null);
    }

    /** , name=LabelsAdd, variable=0 */
    public static final String LABELS_ADD = "labels.add";
    /**
     * value=Add
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsAdd() { // Add
        return MessageFormat.format(BUNDLE.getString(LABELS_ADD), (Object[])null);
    }

    /** , name=LabelsSearch, variable=0 */
    public static final String LABELS_SEARCH = "labels.search";
    /**
     * value=Search
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsSearch() { // Search
        return MessageFormat.format(BUNDLE.getString(LABELS_SEARCH), (Object[])null);
    }

    /** , name=LabelsRegister, variable=0 */
    public static final String LABELS_REGISTER = "labels.register";
    /**
     * value=Register
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsRegister() { // Register
        return MessageFormat.format(BUNDLE.getString(LABELS_REGISTER), (Object[])null);
    }

    /** , name=LabelsUpdate, variable=0 */
    public static final String LABELS_UPDATE = "labels.update";
    /**
     * value=Update
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsUpdate() { // Update
        return MessageFormat.format(BUNDLE.getString(LABELS_UPDATE), (Object[])null);
    }

    /** , name=LabelsMemberList, variable=0 */
    public static final String LABELS_MEMBER_LIST = "labels.member.list";
    /**
     * value=@[labels.list] of @[labels.member]
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsMemberList() { // @[labels.list] of @[labels.member]
        return MessageFormat.format(BUNDLE.getString(LABELS_MEMBER_LIST), (Object[])null);
    }

    /** , name=LabelsMemberAdd, variable=0 */
    public static final String LABELS_MEMBER_ADD = "labels.member.add";
    /**
     * value=@[labels.add] @[labels.member]
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsMemberAdd() { // @[labels.add] @[labels.member]
        return MessageFormat.format(BUNDLE.getString(LABELS_MEMBER_ADD), (Object[])null);
    }

    /** , name=LabelsMemberEdit, variable=0 */
    public static final String LABELS_MEMBER_EDIT = "labels.member.edit";
    /**
     * value=@[labels.edit] @[labels.member]
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsMemberEdit() { // @[labels.edit] @[labels.member]
        return MessageFormat.format(BUNDLE.getString(LABELS_MEMBER_EDIT), (Object[])null);
    }

    /** ------------, name=LabelsHeaderTitleErrorMessage, variable=0 */
    public static final String LABELS_HEADER_TITLE_ERROR_MESSAGE = "labels.header.title.error.message";
    /**
     * value=Notice
     * @return The formatted message. (NotNull)
     */
    public static String getLabelsHeaderTitleErrorMessage() { // Notice
        return MessageFormat.format(BUNDLE.getString(LABELS_HEADER_TITLE_ERROR_MESSAGE), (Object[])null);
    }

    /** ----------, name=MessagesInputNoteKeyword, variable=0 */
    public static final String MESSAGES_INPUT_NOTE_KEYWORD = "messages.input.note.keyword";
    /**
     * value=Input keyword to search 
     * @return The formatted message. (NotNull)
     */
    public static String getMessagesInputNoteKeyword() { // Input keyword to search 
        return MessageFormat.format(BUNDLE.getString(MESSAGES_INPUT_NOTE_KEYWORD), (Object[])null);
    }

    /** , name=MessagesInputNoteEmail, variable=0 */
    public static final String MESSAGES_INPUT_NOTE_EMAIL = "messages.input.note.email";
    /**
     * value=Input your E-mail address
     * @return The formatted message. (NotNull)
     */
    public static String getMessagesInputNoteEmail() { // Input your E-mail address
        return MessageFormat.format(BUNDLE.getString(MESSAGES_INPUT_NOTE_EMAIL), (Object[])null);
    }

    /** , name=MessagesInputNoteEmailOrAccount, variable=0 */
    public static final String MESSAGES_INPUT_NOTE_EMAIL_OR_ACCOUNT = "messages.input.note.emailOrAccount";
    /**
     * value=Input your E-mail or account
     * @return The formatted message. (NotNull)
     */
    public static String getMessagesInputNoteEmailOrAccount() { // Input your E-mail or account
        return MessageFormat.format(BUNDLE.getString(MESSAGES_INPUT_NOTE_EMAIL_OR_ACCOUNT), (Object[])null);
    }

    /** , name=MessagesInputNotePassword, variable=0 */
    public static final String MESSAGES_INPUT_NOTE_PASSWORD = "messages.input.note.password";
    /**
     * value=Input your password
     * @return The formatted message. (NotNull)
     */
    public static String getMessagesInputNotePassword() { // Input your password
        return MessageFormat.format(BUNDLE.getString(MESSAGES_INPUT_NOTE_PASSWORD), (Object[])null);
    }

    /** , name=MessagesInputNoteZipCode, variable=0 */
    public static final String MESSAGES_INPUT_NOTE_ZIP_CODE = "messages.input.note.zipCode";
    /**
     * value=e.g. 153-0051
     * @return The formatted message. (NotNull)
     */
    public static String getMessagesInputNoteZipCode() { // e.g. 153-0051
        return MessageFormat.format(BUNDLE.getString(MESSAGES_INPUT_NOTE_ZIP_CODE), (Object[])null);
    }
}
