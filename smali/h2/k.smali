.class public final synthetic Lh2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/b$a;


# instance fields
.field public final synthetic a:Lh2/r;

.field public final synthetic b:La2/o;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lh2/r;La2/o;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/k;->a:Lh2/r;

    iput-object p2, p0, Lh2/k;->b:La2/o;

    iput p3, p0, Lh2/k;->c:I

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lh2/k;->a:Lh2/r;

    iget-object v1, p0, Lh2/k;->b:La2/o;

    iget v2, p0, Lh2/k;->c:I

    invoke-static {v0, v1, v2}, Lh2/r;->h(Lh2/r;La2/o;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
