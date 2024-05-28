.class public final synthetic Li2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m0$b;


# instance fields
.field public final synthetic a:Li2/m0;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Ld2/a$a;


# direct methods
.method public synthetic constructor <init>(Li2/m0;Ljava/util/Map;Ld2/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/p;->a:Li2/m0;

    iput-object p2, p0, Li2/p;->b:Ljava/util/Map;

    iput-object p3, p0, Li2/p;->c:Ld2/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li2/p;->a:Li2/m0;

    iget-object v1, p0, Li2/p;->b:Ljava/util/Map;

    iget-object v2, p0, Li2/p;->c:Ld2/a$a;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Li2/m0;->u0(Li2/m0;Ljava/util/Map;Ld2/a$a;Landroid/database/Cursor;)Ld2/a;

    move-result-object p1

    return-object p1
.end method
