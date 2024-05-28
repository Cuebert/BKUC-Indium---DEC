.class final synthetic Lcom/google/firebase/iid/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Lcom/google/firebase/iid/b0;

.field private final o:Landroid/os/Bundle;

.field private final p:Lg4/m;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/b0;Landroid/os/Bundle;Lg4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/d0;->n:Lcom/google/firebase/iid/b0;

    iput-object p2, p0, Lcom/google/firebase/iid/d0;->o:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/google/firebase/iid/d0;->p:Lg4/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/iid/d0;->n:Lcom/google/firebase/iid/b0;

    iget-object v1, p0, Lcom/google/firebase/iid/d0;->o:Landroid/os/Bundle;

    iget-object v2, p0, Lcom/google/firebase/iid/d0;->p:Lg4/m;

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/iid/b0;->f(Landroid/os/Bundle;Lg4/m;)V

    return-void
.end method
