.class public final Lg2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lh2/x;",
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
            "Li2/d;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lh2/f;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lh2/f;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg2/i;->a:Lsa/a;

    .line 3
    iput-object p2, p0, Lg2/i;->b:Lsa/a;

    .line 4
    iput-object p3, p0, Lg2/i;->c:Lsa/a;

    .line 5
    iput-object p4, p0, Lg2/i;->d:Lsa/a;

    return-void
.end method

.method public static a(Lsa/a;Lsa/a;Lsa/a;Lsa/a;)Lg2/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Landroid/content/Context;",
            ">;",
            "Lsa/a<",
            "Li2/d;",
            ">;",
            "Lsa/a<",
            "Lh2/f;",
            ">;",
            "Lsa/a<",
            "Lk2/a;",
            ">;)",
            "Lg2/i;"
        }
    .end annotation

    new-instance v0, Lg2/i;

    invoke-direct {v0, p0, p1, p2, p3}, Lg2/i;-><init>(Lsa/a;Lsa/a;Lsa/a;Lsa/a;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Li2/d;Lh2/f;Lk2/a;)Lh2/x;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lg2/h;->a(Landroid/content/Context;Li2/d;Lh2/f;Lk2/a;)Lh2/x;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, p1}, Lc2/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh2/x;

    return-object p0
.end method


# virtual methods
.method public b()Lh2/x;
    .locals 4

    iget-object v0, p0, Lg2/i;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lg2/i;->b:Lsa/a;

    invoke-interface {v1}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li2/d;

    iget-object v2, p0, Lg2/i;->c:Lsa/a;

    invoke-interface {v2}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh2/f;

    iget-object v3, p0, Lg2/i;->d:Lsa/a;

    invoke-interface {v3}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lk2/a;

    invoke-static {v0, v1, v2, v3}, Lg2/i;->c(Landroid/content/Context;Li2/d;Lh2/f;Lk2/a;)Lh2/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg2/i;->b()Lh2/x;

    move-result-object v0

    return-object v0
.end method
