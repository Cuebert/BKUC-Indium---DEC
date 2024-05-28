.class public final Lb2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lb2/k;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lb2/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsa/a;Lsa/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Lb2/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lb2/l;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Lb2/l;->b:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;)Lb2/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Lb2/i;",
            ">;)",
            "Lb2/l;"
        }
    .end annotation

    new-instance v0, Lb2/l;

    invoke-direct {v0, p0, p1}, Lb2/l;-><init>(Lsa/a;Lsa/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Object;)Lb2/k;
    .locals 1

    new-instance v0, Lb2/k;

    check-cast p1, Lb2/i;

    invoke-direct {v0, p0, p1}, Lb2/k;-><init>(Landroid/content/Context;Lb2/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Lb2/k;
    .locals 2

    iget-object v0, p0, Lb2/l;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lb2/l;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lb2/l;->c(Landroid/content/Context;Ljava/lang/Object;)Lb2/k;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb2/l;->b()Lb2/k;

    move-result-object v0

    return-object v0
.end method
