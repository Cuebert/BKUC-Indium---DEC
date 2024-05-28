.class final Lgc/p$i;
.super Lgc/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lgc/p<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I

.field private final c:Lob/y;

.field private final d:Lgc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgc/f<",
            "TT;",
            "Lob/h0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;ILob/y;Lgc/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "I",
            "Lob/y;",
            "Lgc/f<",
            "TT;",
            "Lob/h0;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lgc/p;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/p$i;->a:Ljava/lang/reflect/Method;

    .line 3
    iput p2, p0, Lgc/p$i;->b:I

    .line 4
    iput-object p3, p0, Lgc/p$i;->c:Lob/y;

    .line 5
    iput-object p4, p0, Lgc/p$i;->d:Lgc/f;

    return-void
.end method


# virtual methods
.method a(Lgc/r;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgc/r;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    iget-object v0, p0, Lgc/p$i;->d:Lgc/f;

    invoke-interface {v0, p2}, Lgc/f;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lob/h0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    iget-object p2, p0, Lgc/p$i;->c:Lob/y;

    invoke-virtual {p1, p2, v0}, Lgc/r;->d(Lob/y;Lob/h0;)V

    return-void

    :catch_0
    move-exception p1

    .line 3
    iget-object v0, p0, Lgc/p$i;->a:Ljava/lang/reflect/Method;

    iget v1, p0, Lgc/p$i;->b:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to convert "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to RequestBody"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, p2, v2}, Lgc/y;->o(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
