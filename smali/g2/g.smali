.class public final Lg2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc2/b<",
        "Lh2/f;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lsa/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsa/a<",
            "Lk2/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsa/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Lk2/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg2/g;->a:Lsa/a;

    return-void
.end method

.method public static a(Lk2/a;)Lh2/f;
    .locals 1

    invoke-static {p0}, Lg2/f;->a(Lk2/a;)Lh2/f;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {p0, v0}, Lc2/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh2/f;

    return-object p0
.end method

.method public static b(Lsa/a;)Lg2/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsa/a<",
            "Lk2/a;",
            ">;)",
            "Lg2/g;"
        }
    .end annotation

    new-instance v0, Lg2/g;

    invoke-direct {v0, p0}, Lg2/g;-><init>(Lsa/a;)V

    return-object v0
.end method


# virtual methods
.method public c()Lh2/f;
    .locals 1

    iget-object v0, p0, Lg2/g;->a:Lsa/a;

    invoke-interface {v0}, Lsa/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk2/a;

    invoke-static {v0}, Lg2/g;->a(Lk2/a;)Lh2/f;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lg2/g;->c()Lh2/f;

    move-result-object v0

    return-object v0
.end method
