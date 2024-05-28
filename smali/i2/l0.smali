.class public final synthetic Li2/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m0$b;


# instance fields
.field public final synthetic a:Li2/m0;

.field public final synthetic b:La2/o;


# direct methods
.method public synthetic constructor <init>(Li2/m0;La2/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/l0;->a:Li2/m0;

    iput-object p2, p0, Li2/l0;->b:La2/o;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li2/l0;->a:Li2/m0;

    iget-object v1, p0, Li2/l0;->b:La2/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, p1}, Li2/m0;->k0(Li2/m0;La2/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
