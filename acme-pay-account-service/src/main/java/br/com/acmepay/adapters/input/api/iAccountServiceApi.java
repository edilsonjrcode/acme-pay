package br.com.acmepay.adapters.input.api;

@RequestMapping("/api/v1/accounts")
public interface iAccountServiceApi {
    @GetMapping
    String teste();
}
