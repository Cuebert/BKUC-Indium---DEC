.class final Lhc/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgc/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lgc/f<",
        "Lob/j0;",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lb6/f;

.field private final b:Lb6/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb6/v<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lb6/f;Lb6/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb6/f;",
            "Lb6/v<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lhc/c;->a:Lb6/f;

    .line 3
    iput-object p2, p0, Lhc/c;->b:Lb6/v;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p1, Lob/j0;

    invoke-virtual {p0, p1}, Lhc/c;->b(Lob/j0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lob/j0;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lob/j0;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lhc/c;->a:Lb6/f;

    invoke-virtual {p1}, Lob/j0;->c()Ljava/io/Reader;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb6/f;->p(Ljava/io/Reader;)Lcom/google/gson/stream/JsonReader;

    move-result-object v0

    .line 2
    :try_start_0
    iget-object v1, p0, Lhc/c;->b:Lb6/v;

    invoke-virtual {v1, v0}, Lb6/v;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v0

    sget-object v2, Lcom/google/gson/stream/JsonToken;->END_DOCUMENT:Lcom/google/gson/stream/JsonToken;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v2, :cond_0

    .line 4
    invoke-virtual {p1}, Lob/j0;->close()V

    return-object v1

    .line 5
    :cond_0
    :try_start_1
    new-instance v0, Lb6/m;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lb6/m;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    .line 6
    invoke-virtual {p1}, Lob/j0;->close()V

    .line 7
    throw v0
.end method
