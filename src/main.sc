require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.2

    state: Приветствие
        intent!: /привет
        a: Привет привет

    state: Прощание
        intent!: /пока
        a: Пока пока

    state: Fallback
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

