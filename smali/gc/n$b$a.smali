.class Lgc/n$b$a;
.super Lac/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/n$b;-><init>(Lob/j0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lgc/n$b;


# direct methods
.method constructor <init>(Lgc/n$b;Lac/t;)V
    .locals 0

    iput-object p1, p0, Lgc/n$b$a;->o:Lgc/n$b;

    invoke-direct {p0, p2}, Lac/h;-><init>(Lac/t;)V

    return-void
.end method


# virtual methods
.method public V(Lac/c;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lac/h;->V(Lac/c;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    .line 2
    iget-object p2, p0, Lgc/n$b$a;->o:Lgc/n$b;

    iput-object p1, p2, Lgc/n$b;->q:Ljava/io/IOException;

    .line 3
    throw p1
.end method
