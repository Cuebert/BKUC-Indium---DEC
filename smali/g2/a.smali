.class public final synthetic Lg2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lg2/c;

.field public final synthetic b:La2/o;

.field public final synthetic c:La2/i;


# direct methods
.method public synthetic constructor <init>(Lg2/c;La2/o;La2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/a;->a:Lg2/c;

    iput-object p2, p0, Lg2/a;->b:La2/o;

    iput-object p3, p0, Lg2/a;->c:La2/i;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lg2/a;->a:Lg2/c;

    iget-object v1, p0, Lg2/a;->b:La2/o;

    iget-object v2, p0, Lg2/a;->c:La2/i;

    invoke-static {v0, v1, v2}, Lg2/c;->c(Lg2/c;La2/o;La2/i;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
