.class Lb9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field public static final a:Lb9/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb9/b;

    invoke-direct {v0}, Lb9/b;-><init>()V

    sput-object v0, Lb9/b$a;->a:Lb9/b;

    return-void
.end method
