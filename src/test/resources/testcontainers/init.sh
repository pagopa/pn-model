echo "### CREATE QUEUES ###"
queues="local-model-test-it"
for qn in  $( echo $queues | tr " " "\n" ) ; do
    echo creating queue $qn ...

    aws --profile default --region us-east-1 --endpoint-url http://localstack:4566 \
        sqs create-queue \
        --attributes '{"DelaySeconds":"0"}' \
        --queue-name $qn

done

echo "Initialization terminated"