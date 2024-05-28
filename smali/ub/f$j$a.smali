.class Lub/f$j$a;
.super Lub/f$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lub/f$j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lub/f$j;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lub/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    sget-object v0, Lub/b;->s:Lub/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lub/i;->d(Lub/b;Ljava/io/IOException;)V

    return-void
.end method
