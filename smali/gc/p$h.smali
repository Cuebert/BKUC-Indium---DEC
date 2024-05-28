.class final Lgc/p$h;
.super Lgc/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgc/p<",
        "Lob/y;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/reflect/Method;

.field private final b:I


# direct methods
.method constructor <init>(Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lgc/p;-><init>()V

    .line 2
    iput-object p1, p0, Lgc/p$h;->a:Ljava/lang/reflect/Method;

    .line 3
    iput p2, p0, Lgc/p$h;->b:I

    return-void
.end method


# virtual methods
.method bridge synthetic a(Lgc/r;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    check-cast p2, Lob/y;

    invoke-virtual {p0, p1, p2}, Lgc/p$h;->d(Lgc/r;Lob/y;)V

    return-void
.end method

.method d(Lgc/r;Lob/y;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p1, p2}, Lgc/r;->c(Lob/y;)V

    return-void

    .line 2
    :cond_0
    iget-object p1, p0, Lgc/p$h;->a:Ljava/lang/reflect/Method;

    iget p2, p0, Lgc/p$h;->b:I

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Headers parameter must not be null."

    invoke-static {p1, p2, v1, v0}, Lgc/y;->o(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1
.end method
