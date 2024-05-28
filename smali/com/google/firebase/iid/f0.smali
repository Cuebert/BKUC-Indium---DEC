.class final Lcom/google/firebase/iid/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lg4/c<",
        "Landroid/os/Bundle;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/firebase/iid/b0;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/b0;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/iid/f0;->a:Lcom/google/firebase/iid/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lg4/l;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    const-class v0, Ljava/io/IOException;

    invoke-virtual {p1, v0}, Lg4/l;->l(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    .line 2
    iget-object v0, p0, Lcom/google/firebase/iid/f0;->a:Lcom/google/firebase/iid/b0;

    invoke-static {v0, p1}, Lcom/google/firebase/iid/b0;->e(Lcom/google/firebase/iid/b0;Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
