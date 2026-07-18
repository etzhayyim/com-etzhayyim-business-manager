# business-manager

Canonical standalone implementation repository for the `business-manager` actor.

- `manifest.edn` is the authoritative actor manifest.
- `kotoba/schema.edn`, `lex/*.edn`, and `schema.edn` are authoritative EDN data.
- Clojure implementation is under `src/`; tests are under `test/`.
- `business_manager` is only the Clojure path encoding of the hyphenated namespace.
- The separate `com-etzhayyim-business_manager` repository is an identity-preserving
  compatibility redirect and must not acquire implementation code.

Run tests with `clojure -M:test`.
