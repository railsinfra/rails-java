# Changelog

## 0.1.0 (2026-05-06)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/railsinfra/rails-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** manual updates ([6a1728e](https://github.com/railsinfra/rails-java/commit/6a1728e6a6bf5ea916322b77d7496fca8da02a0c))
* **api:** manual updates ([18e727a](https://github.com/railsinfra/rails-java/commit/18e727a1f4c6678528325457094e06153b11cc96))
* **api:** manual updates ([c7cf9c8](https://github.com/railsinfra/rails-java/commit/c7cf9c8599c94915c1021bdc0aee57f04d8e5a7c))
* **api:** updated the sdk to be inline with rails features ([eef4988](https://github.com/railsinfra/rails-java/commit/eef49880b0a371e767d0a35406ece6c53047bd0c))
* **client:** add connection pooling option ([f64464b](https://github.com/railsinfra/rails-java/commit/f64464b0c0c324766e6c8ea453a0e1e585dfc52d))
* **client:** more robust error parsing ([a5f9dbb](https://github.com/railsinfra/rails-java/commit/a5f9dbb2ef6ede86916cd3e3eadc0d75eaf71823))
* **client:** send `X-Stainless-Kotlin-Version` header ([3acd35e](https://github.com/railsinfra/rails-java/commit/3acd35eb78367279b7c4679ece48365c496e78b2))
* **client:** support proxy authentication ([7b9728b](https://github.com/railsinfra/rails-java/commit/7b9728b83cde213aec6450892f2cff1484f8b373))
* support setting headers via env ([bb7cd42](https://github.com/railsinfra/rails-java/commit/bb7cd42fd623cc196292155942060ac57d51b3ca))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([e987953](https://github.com/railsinfra/rails-java/commit/e987953e403eaf617355c4f465223ee845d916ef))
* **client:** incorrect `Retry-After` parsing ([2eb7713](https://github.com/railsinfra/rails-java/commit/2eb7713ffc2bfccb3fab305fb0c7ce8f52464286))
* **client:** preserve time zone in lenient date-time parsing ([4e76440](https://github.com/railsinfra/rails-java/commit/4e76440787a3c4eb6e26f58d8a9ab1748327e997))


### Performance Improvements

* **client:** create one json mapper ([4aac8c3](https://github.com/railsinfra/rails-java/commit/4aac8c3946d56611859ce5d45e9b2fe9f1c4fff6))


### Chores

* **ci:** skip lint on metadata-only changes ([86a9652](https://github.com/railsinfra/rails-java/commit/86a965251cb0de5a8a1424f9b0f110f9e28608ec))
* **ci:** skip uploading artifacts on stainless-internal branches ([f8f9094](https://github.com/railsinfra/rails-java/commit/f8f9094d8a3b3d48f8e338ecf8603c86b3232f00))
* **ci:** upgrade `actions/github-script` ([0e77226](https://github.com/railsinfra/rails-java/commit/0e772260e30846e55d14835853a235e6d25c480c))
* drop apache dependency ([2a81ceb](https://github.com/railsinfra/rails-java/commit/2a81cebf2ec96cb2494ce3555a6b0fbe031b493f))
* **internal:** allow passing args to `./scripts/test` ([c3271cf](https://github.com/railsinfra/rails-java/commit/c3271cf98245b7570d273998928fc5ddf2907122))
* **internal:** bump ktfmt ([cd004d8](https://github.com/railsinfra/rails-java/commit/cd004d81b6ab83971eba892722b213ba8b67d10f))
* **internal:** bump palantir-java-format ([2a7d501](https://github.com/railsinfra/rails-java/commit/2a7d50191ffb0833cd87f7aa59a1f9330d420eb1))
* **internal:** codegen related update ([ee7d6ad](https://github.com/railsinfra/rails-java/commit/ee7d6ad12e54b9390ff9dd43ec54b68bedd939ab))
* **internal:** codegen related update ([a6fdab7](https://github.com/railsinfra/rails-java/commit/a6fdab7258b239b60dc40d7120ea33674db74d8a))
* **internal:** codegen related update ([d8e8cb6](https://github.com/railsinfra/rails-java/commit/d8e8cb66d0348641859264065b82672c8d625e45))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([b72a9c0](https://github.com/railsinfra/rails-java/commit/b72a9c029e8cc954e2f79e4a423fb21c7dbbb266))
* **internal:** expand imports ([9c46306](https://github.com/railsinfra/rails-java/commit/9c46306328d234d69895d7a5b272a3c0097a23a3))
* **internal:** make `OkHttp` constructor internal ([f0249a0](https://github.com/railsinfra/rails-java/commit/f0249a03836daa9f77a93f2108e70f21a2ef32db))
* **internal:** remove mock server code ([2026b39](https://github.com/railsinfra/rails-java/commit/2026b39f831b2bcb21176dfff3d332f94781514a))
* **internal:** update `TestServerExtension` comment ([119a26c](https://github.com/railsinfra/rails-java/commit/119a26c2b6613c332f09f50da2f1c0370fff75a1))
* **internal:** update gitignore ([1868c1e](https://github.com/railsinfra/rails-java/commit/1868c1eeb62276f6a372c366507ff6af052f3a86))
* **internal:** update retry delay tests ([260cc62](https://github.com/railsinfra/rails-java/commit/260cc6268b773372ff9cd8aa0896b486b4e9cf88))
* **internal:** upgrade AssertJ ([d6c57ac](https://github.com/railsinfra/rails-java/commit/d6c57ac37aeb325e73b3b2b26e898956514b3efd))
* make `Properties` more resilient to `null` ([1bd3416](https://github.com/railsinfra/rails-java/commit/1bd3416150781228f3309e50d93d2102ccc9ea6e))
* remove duplicated dokka setup ([33c14b0](https://github.com/railsinfra/rails-java/commit/33c14b02f5700c1e0afb3b061a09790f40c044d1))
* update mock server docs ([7f4d009](https://github.com/railsinfra/rails-java/commit/7f4d0097d2571917d4c96a5243bd4a7a11e7c6b2))
* update SDK settings ([aea5e89](https://github.com/railsinfra/rails-java/commit/aea5e899019976da23dce9d89bd08706fc6ae86c))
* update SDK settings ([16ced48](https://github.com/railsinfra/rails-java/commit/16ced4872fde150c4c96ce2655950ba0285142f5))


### Documentation

* clarify forwards compat behavior ([c5b5e69](https://github.com/railsinfra/rails-java/commit/c5b5e69c73900944da71afddbaf6901679947fd1))
