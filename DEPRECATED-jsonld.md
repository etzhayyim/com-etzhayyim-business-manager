# DEPRECATED: `actor-manifest.jsonld`

`actor-manifest.jsonld` (+ the original `CLAUDE.md` body) is the **pre-kotoba** T1 MCP-Compose
scaffold. Its pipelines express the read/write path as **Cypher `MATCH`/`CREATE` over
RisingWave-via-Hyperdrive**, which **violates the substrate boundary** (kotoba EAVT only; no
RisingWave/SQL/Cypher as canonical).

**Canonical manifest is now `manifest.edn`** (kotoba-native), per **ADR-2606072000** — the
worked Phase-A conversion of the substrate remediation wave (ADR-2606071800). business-manager
is now an **internal-only, append-only double-entry ERP** on the kotoba Datom log, audited by
`toritate`. See `src/business_manager/methods/agent.cljc`, its tests, and `kotoba/schema.edn`.

The compatibility cycle is complete and the JSON-LD file was removed. EDN is authoritative.
