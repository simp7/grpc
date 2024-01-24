go:
	protoc protos/*.proto --go_out=gen/go --go-grpc_out=gen/go

java:
	cd ./gen/java; gradle jar

generate: go java