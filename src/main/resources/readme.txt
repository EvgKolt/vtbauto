Настройка пропертиз при смене клиента:
1-Клиент по картам(для заказа карты) -
card.login1, card.password1 +
(Cards base 241)select * from tb_organization where inn = '1234567890'
DBConnect(DELETE_CARD_ORDER -organization_id)
2-Клиент по картам для остальных операций
card.login, card.password