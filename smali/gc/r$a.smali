.class Lgc/r$a;
.super Lob/h0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lob/h0;

.field private final b:Lob/b0;


# direct methods
.method constructor <init>(Lob/h0;Lob/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lob/h0;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/r$a;->a:Lob/h0;

    .line 3
    iput-object p2, p0, Lgc/r$a;->b:Lob/b0;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lgc/r$a;->a:Lob/h0;

    invoke-virtual {v0}, Lob/h0;->a()J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lob/b0;
    .locals 1

    iget-object v0, p0, Lgc/r$a;->b:Lob/b0;

    return-object v0
.end method

.method public i(Lac/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lgc/r$a;->a:Lob/h0;

    invoke-virtual {v0, p1}, Lob/h0;->i(Lac/d;)V

    return-void
.end method
