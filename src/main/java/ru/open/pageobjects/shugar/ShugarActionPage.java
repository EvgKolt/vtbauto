package ru.open.pageobjects.shugar;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;
import ru.open.pageobjects.AbstractPage;

@Getter
public class ShugarActionPage extends AbstractPage {

    @FindBy(id = "inn_advanced")
    private SelenideElement inn;

    @FindBy(xpath = "//option[contains(text(),'Корп.карты / самоинкассация – Бизнес Портал')]")
    private SelenideElement requestType;

    @FindBy(id = "search_form_submit")
    private SelenideElement search;

    @FindBy(id = "tab_link_MoneyAccount|advanced_search")
    private SelenideElement searchAdvanced;

    @FindBy(xpath = "//*[contains(text(), '\n"
            + "В работе ООС (РСЦ)')]")
    private SelenideElement inWork;

    @FindBy(xpath = "//a[@title='Изменить']")
    private SelenideElement changeStatus;

    @FindBy(xpath = "//select[@id='status']")
    private SelenideElement statusMenu;

    @FindBy(xpath = "//select/option[@value='waiting_info']")
    private SelenideElement statusMenuOption1;

    @FindBy(xpath = "//form[@id='set_status_frm']/input[contains(@class, 'button')]")
    private SelenideElement saveStatus;

    @FindBy(xpath = "//input[@id='btn_account_name']")
    private SelenideElement choose;

    @FindBy(xpath = "//*[@id='inn_c_advanced']")
    private SelenideElement chooseByInn;

    @FindBy(xpath = "//input[@value = 'Найти']")
    private SelenideElement find;

    @FindBy(xpath = "(//a[contains(@onclick, 'send_back')])[2]")
    private SelenideElement client;

    @FindBy(xpath = "//a[contains(@onclick, 'send_back')]")
    private SelenideElement coworker;

    @FindBy(xpath = "//select[@id='opportunity_type']")
    private SelenideElement type;

    @FindBy(xpath = "//select/option[@value='Intr_changes']")
    private SelenideElement typeOption1;

    @FindBy(xpath = "//input[@id='kpp']")
    private SelenideElement kpp;

    @FindBy(xpath = "//input[@id='short_name']")
    private SelenideElement shortName;

    @FindBy(xpath = "//select[@id='document_pack']")
    private SelenideElement documentType;

    @FindBy(xpath = "//select/option[@value='full']")
    private SelenideElement documentTypeOption1;

    @FindBy(xpath = "//select[@id='type_dbo']")
    private SelenideElement typeDbo;

    @FindBy(xpath = "//select/option[@value='signer_bp']")
    private SelenideElement typeDboOption1;

    @FindBy(xpath = "//input[@id='okved']")
    private SelenideElement okved;

    @FindBy(xpath = "//input[@id='okpo']")
    private SelenideElement okpo;

    @FindBy(xpath = "//select[@id='service_office']")
    private SelenideElement serviceOffice;

    @FindBy(xpath = "//select/option[@value='923bc7b2-8d1d-ce82-e086-58a16b2b26d1']")
    private SelenideElement serviceOfficeOption1;

    @FindBy(xpath = "//div/input[contains(@class, 'button')][1]")
    private SelenideElement save;

    @FindBy(xpath = "//select[@id='ownership']")
    private SelenideElement ownership;

    @FindBy(xpath = "//select/option[@value='65']")
    private SelenideElement ownershipOption1;

    @FindBy(xpath = "//input[@id='contact1_phone']")
    private SelenideElement contact1;

    @FindBy(xpath = "//input[@id='contact1_extra_phone']")
    private SelenideElement contact2;

    @FindBy(xpath = "//input[@id='num_get_info']")
    private SelenideElement numGetInfo;

    @FindBy(xpath = "//form[@id='formformNotes']/input[contains(@class, 'button')]")
    private SelenideElement addDoc;

    @FindBy(xpath = "//select[@id='type']")
    private SelenideElement docTypeFile;

    @FindBy(xpath = "//select/option[@value='10']")
    private SelenideElement docTypeOptionFile;

    @FindBy(xpath = "//span[@id='new_attachment']/input")
    private SelenideElement chooseDoc;

    @FindBy(xpath = "//td/input[@id='Notes_subpanel_save_button']")
    private SelenideElement saveDoc;

    @FindBy(xpath = "//form[@id='formformContacts_msb']/input[contains(@class, 'button')]")
    private SelenideElement addPerson;

    @FindBy(xpath = "//select[@id='contact_msb_operation']")
    private SelenideElement action;

    @FindBy(xpath = "//select/option[@value='Insert']")
    private SelenideElement actionOption1;

    @FindBy(xpath = "//select[@id='signature_type']")
    private SelenideElement signatureType;

    @FindBy(xpath = "//select/option[@value='first']")
    private SelenideElement signatureTypeOption1;

    @FindBy(xpath = "//select[@id='resident']")
    private SelenideElement resident;

    @FindBy(xpath = "//select/option[@value='rf']")
    private SelenideElement residentOption1;

    @FindBy(xpath = "//input[@id='first_name']")
    private SelenideElement name;

    @FindBy(xpath = "//input[@id='patron_name']")
    private SelenideElement middleName;

    @FindBy(xpath = "//input[@id='last_name']")
    private SelenideElement lastName;

    @FindBy(xpath = "//select[@id='gender']")
    private SelenideElement sex;

    @FindBy(xpath = "//select/option[@value='w']")
    private SelenideElement sexOption1;

    @FindBy(xpath = "//input[@id='birthdate']")
    private SelenideElement dateOfBirth;

    @FindBy(xpath = "//input[@id='phone_mobile']")
    private SelenideElement phone;

    @FindBy(xpath = "//select[@id='birth_region']")
    private SelenideElement region;

    @FindBy(xpath = "//select/option[@value='1000000000']")
    private SelenideElement regionOption1;

    @FindBy(xpath = "//input[@id='birth_place']")
    private SelenideElement birthPlace;

    @FindBy(xpath = "//select[@id='doc_type']")
    private SelenideElement docType;

    @FindBy(xpath = "//select/option[@value='21']")
    private SelenideElement docTypeOption1;

    @FindBy(xpath = "//input[@id='passport_serial']")
    private SelenideElement psSerial;

    @FindBy(xpath = "//input[@id='passport_number']")
    private SelenideElement psNumber;

    @FindBy(xpath = "//input[@id='department_code']")
    private SelenideElement department;

    @FindBy(xpath = "//input[@id='passport_date_issued']")
    private SelenideElement psDate;

    @FindBy(xpath = "//input[@id='passport_where_issued']")
    private SelenideElement passportIssue;

    @FindBy(xpath = "//input[@id='btn_kladdress_fact_fl_id_name']")
    private SelenideElement address;

    @FindBy(xpath = "//input[@id='btn_coworker_user_fio']")
    private SelenideElement chooseCoworker;

    @FindBy(xpath = "//input[@name='user_name']")
    private SelenideElement coworkerLogin;

    @FindBy(id = "addressString_input")
    private SelenideElement addressOneString;

    @FindBy(id = "checkAddressButton")
    private SelenideElement checkAddressButton;

    @FindBy(id = "Ok")
    private SelenideElement okButton;

    @FindBy(id = "kladdressSave")
    private SelenideElement kladdressSave;

    @FindBy(id = "oksm")
    private SelenideElement oksm;

    @FindBy(xpath = "//input[@id='marketplace_email']")
    private SelenideElement email;

    @FindBy(xpath = "//td/input[@id='Contacts_msb_subpanel_save_button']")
    private SelenideElement savePerson;

    @FindBy(xpath = "//span[@id='panel_title']")
    private SelenideElement panelTitle;

    @FindBy(xpath = "//textarea")
    private SelenideElement textArea;

    @FindBy(xpath = "//input[@id='confirm_btn']")
    private SelenideElement statusChange;

    @FindBy(xpath = "//select[@id='status']")
    private SelenideElement status;

    @FindBy(xpath = "//select/option[@value='check_secure']")
    private SelenideElement statusOption1;

    @FindBy(xpath = "//select/option[@value='work_secure']")
    private SelenideElement statusOption2;

    @FindBy(xpath = "//div[@id='content']/table/tbody/tr/td/a")
    private SelenideElement checking;

    @FindBy(xpath = "//input[@id='standard_form-save_id']")
    private SelenideElement saveZone;

    @FindBy(xpath = "//input[@id='new_confirm_btn']")
    private SelenideElement working;

    @FindBy(xpath = "//select[@id='assigned_user_id']")
    private SelenideElement assignedUser;

    @FindBy(xpath = "//select/option[@value='97ad7dca-f6c2-c155-e906-5b34c9ba8d9b']")
    private SelenideElement assignedUserOption1;

    @FindBy(xpath = "//div/a[contains(@class, 'utilsLink')]")
    private SelenideElement exit;












}

