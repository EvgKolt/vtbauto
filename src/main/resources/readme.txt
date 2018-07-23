Настройка пропертиз при смене клиента:
1-Клиент по картам(для заказа карты) -
card.login1, card.password1 +
(Cards base 241)select * from tb_organization where inn = '***********'->
->DBConnect(DELETE_CARD_ORDER ->organization_id)
2-Клиент по картам для остальных операций
card.login, card.password
3-Клиент на 273:
login, password +
(contact_id(tb_contact)->tb_person_contact->tb_organization)
DBConnect(CURRENT_EMAIL) = contact_id = "****";