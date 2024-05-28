.class Lbc/c$a;
.super Ljava/lang/ThreadLocal;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Lbc/c$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lbc/c;


# direct methods
.method constructor <init>(Lbc/c;)V
    .locals 0

    iput-object p1, p0, Lbc/c$a;->a:Lbc/c;

    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()Lbc/c$c;
    .locals 1

    new-instance v0, Lbc/c$c;

    invoke-direct {v0}, Lbc/c$c;-><init>()V

    return-object v0
.end method

.method protected bridge synthetic initialValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbc/c$a;->a()Lbc/c$c;

    move-result-object v0

    return-object v0
.end method
