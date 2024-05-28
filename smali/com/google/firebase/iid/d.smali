.class final synthetic Lcom/google/firebase/iid/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg4/c;


# instance fields
.field private final a:Lcom/google/firebase/iid/e;

.field private final b:Landroid/util/Pair;


# direct methods
.method constructor <init>(Lcom/google/firebase/iid/e;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/iid/d;->a:Lcom/google/firebase/iid/e;

    iput-object p2, p0, Lcom/google/firebase/iid/d;->b:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final a(Lg4/l;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/iid/d;->a:Lcom/google/firebase/iid/e;

    iget-object v1, p0, Lcom/google/firebase/iid/d;->b:Landroid/util/Pair;

    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/iid/e;->a(Landroid/util/Pair;Lg4/l;)Lg4/l;

    move-result-object p1

    return-object p1
.end method
