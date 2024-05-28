.class final Lcom/google/firebase/iid/i;
.super Lu3/e;
.source "SourceFile"


# instance fields
.field private final synthetic a:Lcom/google/firebase/iid/f;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/f;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/google/firebase/iid/i;->a:Lcom/google/firebase/iid/f;

    invoke-direct {p0, p2}, Lu3/e;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/iid/i;->a:Lcom/google/firebase/iid/f;

    invoke-static {v0, p1}, Lcom/google/firebase/iid/f;->e(Lcom/google/firebase/iid/f;Landroid/os/Message;)V

    return-void
.end method
