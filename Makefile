go:
	protoc protos/*.proto --go_out=gen/go --go-grpc_out=gen/go

java:
	protoc protos/*.proto --java_out=gen/java/src/main/java

generate: go java