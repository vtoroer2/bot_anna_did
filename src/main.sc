require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /
    
    state: /hello
        q!: *start
        intent!: /привет
        a: Привет!
        
    state: /weather
        q!: *weather*
        q!: [*~погода*/*~прогноз*/*осадк*/*~дождь*/*~снег*/*~град*/*~туман*/*~гроза*/*холод*/*прохлад*/*тепл*/*жарк*/*солн*/*~туча*/*обло*]
        a: weather +++
        
    state: /currency
        q!: [*~валюта*/*~курс*/*~доллар*/*~евро*/*~рубль*/*~сколько*/*~стоить*]
        a: $&$
        
    state: /NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}