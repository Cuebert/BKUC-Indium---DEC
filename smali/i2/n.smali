.class public final synthetic Li2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m0$b;


# instance fields
.field public final synthetic a:Li2/m0;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Ld2/a$a;


# direct methods
.method public synthetic constructor <init>(Li2/m0;Ljava/lang/String;Ljava/util/Map;Ld2/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/n;->a:Li2/m0;

    iput-object p2, p0, Li2/n;->b:Ljava/lang/String;

    iput-object p3, p0, Li2/n;->c:Ljava/util/Map;

    iput-object p4, p0, Li2/n;->d:Ld2/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Li2/n;->a:Li2/m0;

    iget-object v1, p0, Li2/n;->b:Ljava/lang/String;

    iget-object v2, p0, Li2/n;->c:Ljava/util/Map;

    iget-object v3, p0, Li2/n;->d:Ld2/a$a;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, v3, p1}, Li2/m0;->n0(Li2/m0;Ljava/lang/String;Ljava/util/Map;Ld2/a$a;Landroid/database/sqlite/SQLiteDatabase;)Ld2/a;

    move-result-object p1

    return-object p1
.end method
